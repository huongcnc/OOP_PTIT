package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++) {
                if(arr[i]>arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }                       
            }
            
            System.out.printf("Buoc %d:", i+1);
            for(int j=0;j<n;j++) System.out.print(" "+arr[j]);
            System.out.println();
        }
    }
    
}
