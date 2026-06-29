import java.util.*;
class pivot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int tot=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            tot+=a[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            int right=tot-left-a[i];
            if(left == right){
                System.out.println(i);
                return;
            }
            left+=a[i];
        }
    }
}