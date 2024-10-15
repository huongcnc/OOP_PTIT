package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            check(s);
        }
    }

    private static void check(String s) {
        int cnt=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) cnt++;
        }
        if((s.length()%2==0&&cnt==1)||(s.length()%2==1&&cnt<=1)){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
