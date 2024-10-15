package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long a[] = new long[n+1];
            a[1] = a[2] = 1;
            for(int i=3;i<=n;i++){
                a[i] = a[i-1] + a[i-2];
            }
            System.out.printf("%d\n", a[n]);
        }
    }
    
}
