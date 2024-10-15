package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//sc.nextLine();
        while(t-->0){
            String s = sc.next();
            if(chec(s)==true) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }

    private static boolean chec(String s) {
        for(int i=0;i<s.length()/2;i++){
            int x = (int) s.charAt(i)-'0',y=(int) s.charAt(s.length()-i-1)-'0';
            if(x!=y||x%2==1) return false;
        }
        return true;
    }
    
}
