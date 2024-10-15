package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(check(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(int n){
        while(n!=0){
            int a=n%10;n/=10;
            if(a!=1&&a!=0&&a!=2) return false;
        }
        return true;
    }
}
