package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(check(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(long n){
        long a=n%10;n/=10;
        while(n!=0){
            if(Math.abs(a-n%10)!=1) return false;
            a=n%10;
            n/=10;
        }
        return true;
    }
    
}
