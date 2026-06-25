import java.util.*;
public class movezero{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int index=0;
		for(int i=0;i<n;i++){
			if(a[i]!=0){
				a[index++]=a[i];
			}
		}
		while(index<n){
			a[index++]=0;
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
		
