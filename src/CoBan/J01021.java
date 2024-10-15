package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01021 {

    /**
     * @param args the command line arguments
     */
    static long m = (long)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(),b = sc.nextLong();
            if(a==0&&b==0) break;
            System.out.println(lt(a,b));
        }
    }
    
    public static long lt(long a,long b){
        if(b==1) return a;
        if(b==0) return 1;
        long n = lt(a,b/2);
        if(b%2==0) return n*n%m;
        return ((n*n)%m)*a%m;
        
    }
    
}
