package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        Map<String,Integer> map = new HashMap<>();
        while(t-->0){
            String s[]= sc.nextLine().toLowerCase().trim().split("\\s+");
            String a = s[s.length-1];
            for(int i=0;i<s.length-1;i++) a=a+s[i].substring(0,1);
            if(!map.containsKey(a)) {
                map.put(a,1);
                System.out.printf("%s@ptit.edu.vn\n",a);
            } else {
                map.put(a, map.get(a)+1);
                System.out.printf("%s%d@ptit.edu.vn\n",a,map.get(a));
            }
            
            
            
        }
    }
    
}
/*
4
    nGUYEn    quaNG   vInH  
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
*/