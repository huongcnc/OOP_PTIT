package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res=0,a=1;
        for(int i=1;i<=n;i++){
            a*=(long)i;
            res+=a;
        }
        System.out.print(res);
    }
    
}
