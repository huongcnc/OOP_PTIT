package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    if(n==i) break;
                    n/=i;
                }
            }
            System.out.println(n);
        }
    }
    
}
