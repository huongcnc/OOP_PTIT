package KBLVDT.J04006;

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
        SinhVien sv = new SinhVien(sc.nextLine(),sc.next(),sc.next(),sc.nextDouble());
        System.out.print(sv.toString());
    }
    
}
