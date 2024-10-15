package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n-1;i++){
            int k=i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[k]) k=j;
            }
            int c = arr[i];
            arr[i] = arr[k];
            arr[k] = c;
            System.out.printf("Buoc %d:", i+1);
            for(int j=0;j<n;j++) System.out.print(" "+arr[j]);
            System.out.println();
        }
    }
    
}
