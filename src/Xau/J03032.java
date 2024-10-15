package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t-->0){
            String s[] = sc.nextLine().trim().split("\\s+");
            for(int i=0;i<s.length;i++){
                in(s[i]);
            }
            System.out.println();
        }
    }

    private static void in(String s) {
        for(int i=s.length()-1;i>=0;i--) System.out.print(s.charAt(i));
        System.out.print(" ");
    }
    
}
