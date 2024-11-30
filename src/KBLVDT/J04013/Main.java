package KBLVDT.J04013;

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
        SinhVien sv = new SinhVien(sc.nextLine(),sc.nextLine(),
                        Double.parseDouble(sc.nextLine()),
                        Double.parseDouble(sc.nextLine()),
                        Double.parseDouble(sc.nextLine()));
        System.out.print(sv);
    }
    
}

