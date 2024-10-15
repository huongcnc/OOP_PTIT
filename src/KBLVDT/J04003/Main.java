package KBLVDT.J04003;

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
        PhanSo p = new PhanSo(sc.nextLong(),sc.nextLong());
        System.out.print(p.toString());      
    }
}
