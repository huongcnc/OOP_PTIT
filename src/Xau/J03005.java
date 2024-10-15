package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t-->0){
            String s[]= sc.nextLine().toLowerCase().trim().split("\\s+");
            for(int i=1;i<s.length;i++){
                System.out.print((char)(s[i].charAt(0)-32)+s[i].substring(1));
                if(i!=s.length-1) System.out.print(" ");
            }
            System.out.printf(", %s\n", s[0].toUpperCase());
            
        }
    }
    
}
