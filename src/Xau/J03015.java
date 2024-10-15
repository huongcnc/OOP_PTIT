package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;
import java.math.*; 

public class J03015{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.subtract(b));
        }
    }
}
