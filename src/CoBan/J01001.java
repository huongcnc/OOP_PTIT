package CoBan;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.Scanner;
public class J01001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a<=0||b<=0) System.out.print(0);
        else System.out.printf("%d %d",2*(a+b),a*b);
    }
    
}
