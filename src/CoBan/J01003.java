package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if(a==0) {
            if(b==0) System.out.print("VSN");
            else System.out.print("VN");
        } else {
            System.out.printf("%.2f",-b/a);
        }
    }
    
}
