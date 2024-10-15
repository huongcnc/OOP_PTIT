package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int res=1,cnt=0;
            while(n%2==0) {
                cnt++;
                n/=2;
            } 
            res*=cnt;
            for(int i=3;i<=Math.sqrt(n);i++){
                cnt=0;
                while(n%i==0){
                    cnt++;
                    n/=i;
                }
                if(cnt!=0) res*=cnt+1;
            }
            if(n!=1) res*=2;
            System.out.println(res);
        }
    }
    
    
}