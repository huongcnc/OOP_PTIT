package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02021 {

    /**
     * @param args the command line arguments
     */
    public static Vector<Integer> v;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k = sc.nextInt();
        int a[] = new int[n+1];
        cnt=0;
        Try(1,a,n,k);
        System.out.printf("\nTong cong co %d to hop", cnt);
    }
    private static int cnt;
    public static void Try(int t,int a[],int n,int k){
        for(int i=a[t-1]+1;i<=n-k+t;i++){
            a[t]=i;
            if(t==k) {
                for(int j=1;j<=k;j++) System.out.print(a[j]);
                System.out.print(" ");
                cnt++;
            } else Try(t+1,a,n,k);
        }
    }
}
