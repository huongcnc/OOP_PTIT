package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02022 {

    /**
     * @param args the command line arguments
     */
    public static Vector<Integer> v;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n+1],check[]= new int[n+1];
            Try(1,a,n,check);
            System.out.println();
            
        }
    }
    public static void Try(int t,int a[],int n,int check[]){
        for(int i=1;i<=n;i++){
            if(check[i]==0){
                check[i]=1;
                a[t]=i;
                if(t==n) in(a,n);
                else Try(t+1,a,n,check);
                check[i]=0;
            }
        }
    }

    private static void in(int a[],int n) {
        for(int i=2;i<=n;i++){
            if(Math.abs(a[i]-a[i-1])==1) return;
        }
        for(int i=1;i<=n;i++) System.out.print(a[i]);
        System.out.println();
    }
    
}
