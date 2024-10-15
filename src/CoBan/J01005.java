package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), h = sc.nextInt();
            for(int i=1;i<n;i++){
                System.out.printf("%.6f ",(double)h*Math.sqrt(i)/Math.sqrt(n));
            }
            System.out.println();
        }
    }
    
}
