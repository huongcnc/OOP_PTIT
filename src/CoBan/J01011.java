package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.printf("%d %d\n",lcd(a,b),gcd(a,b));
        }
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
    public static long lcd(int a,int b){
        return (long) a*b/gcd(a,b);
    }
    
}