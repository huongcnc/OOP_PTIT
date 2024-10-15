package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long x[] = new long[n+1];
            x[1]=x[2]=1;
            for(int i=3;i<=n;i++){
                x[i]=x[i-2]+x[i-1];
            }
            System.out.println(xnp(x,n,k));
        }
    }
    
    public static int xnp(long x[],int n,long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k<=x[n-2]) return xnp(x,n-2,k);
        return xnp(x,n-1,k-x[n-2]);
        
    }
    
}
