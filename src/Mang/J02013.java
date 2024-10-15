package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            if(check(arr)==true) break;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
            System.out.printf("Buoc %d:",i+1);
            for(int j=0;j<n;j++) System.out.printf(" %d", arr[j]);
            System.out.println();
        }
        
    }
    public static boolean check(int arr[]){
        for(int i = 1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    
}
