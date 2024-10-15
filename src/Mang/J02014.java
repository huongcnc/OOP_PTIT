package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            solve(a,n);
        }
        
    }

    private static void solve(int[] a, int n) {
        int sum=0,lsum=0;
        for(int i:a) sum+=i;
        for(int i=0;i<n;i++){
            if(2*lsum==sum-a[i]){
                System.out.println((i+1));
                return;
            }
            lsum+=a[i];
        }
        System.out.println(-1);
    }
    
    
}
