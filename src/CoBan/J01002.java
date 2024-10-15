package CoBan;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.Scanner;

public class J01002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.printf("%d\n", (long)n*(n+1)/2);
        }
        
    }
    
}
