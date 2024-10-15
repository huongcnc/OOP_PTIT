package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = (int) Math.sqrt(2000000)+1;
        int a[] = new int [k*k+1];
        a[1] = 1;
        for(int i=2;i<=k;i++){
            if(a[i]==0) a[i]=i;
            for(int j=2;j<=i;j++){
                a[i*j]=a[i]+a[j];
            }
        }
        int t = sc.nextInt();
        long res=0;
        while(t-->0) {
            int n = sc.nextInt();
            if(a[n]==0) res+=(long)n;
            else res+=(long)a[n];
        }
        System.out.println(res);
    }
    
    
}