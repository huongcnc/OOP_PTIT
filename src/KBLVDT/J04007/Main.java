package KBLVDT.J04007;

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
        NhanVien nv = new NhanVien();
        nv.setTen(sc.nextLine());
        nv.setGt(sc.next());
        nv.setNs(sc.next());sc.nextLine();
        nv.setDc(sc.nextLine());
        nv.setMst(sc.next());
        nv.setNkhd(sc.next());
        System.out.printf("%s %s %s %s %s %s %s",nv.getMnv(),nv.getTen(),nv.getGt(),nv.getNs(),nv.getDc(),nv.getMst(),nv.getNkhd());
    }
    
}
