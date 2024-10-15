package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;
import java.math.*; 

public class J03013{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            int size = Math.max(a.toString().length(), b.toString().length());
            BigInteger res;
            if(a.compareTo(b)>0) res = a.subtract(b);
            else res = b.subtract(a);
            for(int i=0;i<size-res.toString().length();i++) System.out.print("0");
            System.out.println(res);
        }
    }
}
