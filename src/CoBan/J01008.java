package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            System.out.printf("Test %d:", i);
            for(int j=2;j<=Math.sqrt(n);j++){
                int cnt=0;
                while(n%j==0){
                    cnt++;
                    n/=j;
                }
                if(cnt!=0) System.out.printf(" %d(%d)",j,cnt);
            }
            if(n!=1) System.out.printf(" %d(%d)",n,1);
            System.out.println();
        }
    }
    
}
