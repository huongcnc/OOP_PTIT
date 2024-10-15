package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;
import java.math.*; 

public class J03033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(lcd(a,b));
        }
    }

    private static BigInteger gcd(BigInteger a, BigInteger b) {
        BigInteger k = new BigInteger("0");
        if(b.compareTo(k)==0) return a;
        return gcd(b,a.mod(b));
    }

    private static BigInteger lcd(BigInteger a, BigInteger b) {
        BigInteger x = a.divide(gcd(a,b));
        return x.multiply(b);
    }
    
    
}
