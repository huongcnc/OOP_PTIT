package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03024 {

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
        int C=0,L=0;
        for(int i=0;i<s.length();i++){
            int k = s.charAt(i)-'0';
            if(k<0||k>9) {
                System.out.println("INVALID");
                return;
            }
            if(k%2==0) C++;
            else L++;
        }
        if((s.length()%2==0&&C>L)||(s.length()%2==1&&C<L)){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    
}
