package Mang;
/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int T=1;T<=t;T++){
            int n = sc.nextInt(),m = sc.nextInt();
            int a[][] = new int[n][m],b[][] = new int[m][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            System.out.printf("Test %d:\n", T);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int sum=0;
                    for(int k=0;k<m;k++) sum+=a[i][k]*b[k][j];
                    System.out.print(sum+" ");
                }
                System.out.println();
            }
        }
        
        
        
    }    
    
}

