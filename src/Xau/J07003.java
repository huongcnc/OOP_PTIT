package Xau;



/**
 *
 * @author Hoàng Hướng
 */

import java.io.*;
import java.util.*;
import java.math.*;
public class J07003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length()!=1){
            s = tong(s);
            System.out.println(s);
        }

        
    }

    private static String tong(String s) {
        BigInteger a = new BigInteger(s.substring(0,s.length()/2));
        BigInteger b = new BigInteger(s.substring(s.length()/2,s.length()));
        return a.add(b).toString();
    }
    
}
