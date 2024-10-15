package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(snt(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean snt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    
}
