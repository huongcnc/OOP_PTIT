package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]) {
                int c = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = c;
                j--;
            }
            System.out.printf("Buoc %d:",i);
            for(j=0;j<=i;j++) System.out.printf(" %d", arr[j]);
            System.out.println();
        }
    }
    
}
