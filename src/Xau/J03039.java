package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.math.BigInteger;
import java.util.*;

public class J03039 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if(check(a,b)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean check(BigInteger a, BigInteger b) {
        BigInteger m1 = a.mod(b),m2 = b.mod(a);
        BigInteger s0 = new BigInteger("0");
        if(m1.compareTo(s0)==0||m2.compareTo(s0)==0) return true;
        return false;
    }
    
}
