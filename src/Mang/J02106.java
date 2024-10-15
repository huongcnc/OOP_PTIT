package Mang;
/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++) a[i][j] = sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            int c0=0,c1=1;
            for(int j=0;j<3;j++) {
                if(a[i][j]==1) c1++;
                else c0++;
            }
            if(c1>c0) cnt++;
        }
        System.out.print(cnt);
    }    
    
}

