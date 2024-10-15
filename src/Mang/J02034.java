package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int b[] = new int[a[n-1]+1];
        for(int i=0;i<n;i++) b[a[i]]=1;
        int check=0;
        for(int i=1;i<=a[n-1];i++){
            if(b[i]==0){
                System.out.println(i);
                check=1;
            }
        }
        if(check==0) System.out.print("Excellent!");
        
    }    
    
}

