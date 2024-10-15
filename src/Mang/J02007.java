package Mang;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J02007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int T=1;T<=t;T++){
            int n = sc.nextInt();
            int arr[] = new int[n], check[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            System.out.printf("Test %d:\n", T);
            for(int i=0;i<n;i++){
                if(check[i]==1) continue;
                int cnt=1;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]) {
                        check[j]=1;
                        cnt++;
                    }
                }
                System.out.printf("%d xuat hien %d lan\n",arr[i],cnt);
            }
            
        }
    }
}
