package KBLVDT.J04005;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.print(ts.toString());
    }
    
}
