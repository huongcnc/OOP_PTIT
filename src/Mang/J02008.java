package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.Scanner;

public class J02008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long res=1;
            for(int i=1;i<=n;i++){
                res = lcd(res,i);
            }
            System.out.println(res);
        }
    }
    public static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
    public static long lcd(long a,long b){
        return a*b/gcd(a,b);
    }
    
}
