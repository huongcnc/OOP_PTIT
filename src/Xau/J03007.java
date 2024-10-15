package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03007 {

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
            if(x!=y||(i==0&&x!=8)) return false;
        }
        int sum=0;
        for(int i=0;i<s.length()/2;i++){
            sum += (int) s.charAt(i)-'0';
            
        }
        if(sum%10!=0) return false;
        return true;
    }
    
}
