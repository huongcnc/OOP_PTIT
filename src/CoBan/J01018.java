package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01018 {

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
        long sum=a;
        while(n!=0){
            if(Math.abs(a-n%10)!=2) return false;
            a=n%10;
            sum+=a;
            n/=10;
        }
        if(sum%10!=0) return false;
        return true;
    }
    
}
