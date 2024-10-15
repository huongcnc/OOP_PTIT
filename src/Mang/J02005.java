package Mang;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J02005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int a[] = new int[n], b[] = new int[m];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for(int i=0;i<m;i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<n&&j<m){
            if(a[i]>b[j]) j++;
            else if(a[i]<b[j]) i++;
            else {
                if(i==0||a[i]!=a[i-1]) System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }      
    }
}
