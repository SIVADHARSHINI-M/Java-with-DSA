import java.util.*;
class spiral {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=3,m=3;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int[][] a=new int[n][m];
        System.out.println("Enter Matrix :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Spiral Matrix :");
        for(int i=left;i<=right;i++){
            System.out.print(a[top][i]+" ");
        }
        for(int i=top+1;i<=bottom;i++){
            System.out.print(a[i][right]+" ");
        }
        for(int i=right-1;i>=left;i--){
            System.out.print(a[right][i]+" ");
        }
        for(int i=top;i<right;i++){
            System.out.print(a[top+1][i]+" ");
        }
    }
}