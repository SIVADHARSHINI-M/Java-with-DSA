import java.util.*;
class Max{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int maxsum=0;
        for(int i=0;i<n;i++){
            int sum=a[i];
            maxsum=Math.max(maxsum,sum);
            for(int j=i+1;j<n;j++){
                sum+=a[j];
                maxsum=Math.max(maxsum,sum);
            }
        }
        System.out.print(maxsum);
    }
}