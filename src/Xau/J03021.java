package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;
import java.math.*; 

public class J03021{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String,Integer> m = new HashMap<>();
        int x = 2;
        for(int i=1;i<=26;i++){
            char c = (char) ('A'+i-1);
            m.put(c+"",x);
            if(i==19||i==22||(i<=15&&i%3==0)) {
                x++;
            }
        }
        while(t-->0){
            String s = sc.next().toUpperCase();
            if(check(m,s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean check(Map<String, Integer> m, String s) {
        int l = s.length();
        for(int i=0;i<l/2;i++){
            if(m.get(s.substring(i,i+1))!=m.get(s.substring(l-i-1,l-i))) {
                return false;
            }
        }
        return true;
    }
}
