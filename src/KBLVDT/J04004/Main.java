package KBLVDT.J04004;

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
        PhanSo p1 = new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo p2 = new PhanSo(sc.nextLong(),sc.nextLong());
        System.out.print(PhanSo.tong(p1, p2).toString());      
    }
    
    
    
}
