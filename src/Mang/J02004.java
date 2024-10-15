package Mang;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J02004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            if(check(arr,n)==true) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
    public static boolean check(int arr[],int n){
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]) return false;        
        }
        return true;
    }
}
