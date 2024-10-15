package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;
import java.math.*; 

public class J03011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(gcd(a,b));
        }
    }

    private static BigInteger gcd(BigInteger a, BigInteger b) {
        BigInteger k = new BigInteger("0");
        if(b.compareTo(k)==0) return a;
        return gcd(b,a.mod(b));
    }
    
}
