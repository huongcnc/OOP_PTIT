package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next(),s2=sc.next();
            if(s1.equals(s2)==true) System.out.println("-1");
            else System.out.println(Math.max(s1.length(), s2.length()));
        }
    }

}
