package KBLVDT.J04015;

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
        String mn = sc.next();sc.nextLine();
        String ten = sc.nextLine();
        int tn = sc.nextInt();
        GiaoVien gv = new GiaoVien(mn,ten,tn);
        System.out.printf("%s %s %d %d %d",gv.getMn(),gv.getTen(),gv.getBl(),gv.getPc(),gv.getTn());
    }
    
}
