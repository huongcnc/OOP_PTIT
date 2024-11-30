package KBLVDT.J04014;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            PhanSo a = new PhanSo(sc.nextInt(),sc.nextInt());
            PhanSo b = new PhanSo(sc.nextInt(),sc.nextInt());
            PhanSo c = a.congPhanSo(b).nhanPhanSo(a.congPhanSo(b));
            PhanSo d = a.nhanPhanSo(b).nhanPhanSo(c);
            System.out.println(c + " " + d);
        }
    }
    
}
