import java.util.*;
class Transpose {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=3,m=3;
        int[][] a=new int[n][m];
        System.out.println("Enter Matrix 1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        int[][] trans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[i][j]=a[j][i];
            }
        }
        System.out.println("Transpose of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}