package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(checkfb(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean checkfb(long n){
        if(n==0||n==1) return true;
        long a=1,b=1;
        while(n>b){
            long c=a;
            a=b;
            b=c+b;
            if(n==b) return true;
        }
        return false;
    }
    
}