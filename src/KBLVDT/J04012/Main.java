package KBLVDT.J04012;

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
        while(sc.hasNextLine()){
            NhanVien nv = new NhanVien(sc.nextLine(),Integer.parseInt(sc.nextLine()),
                              Integer.parseInt(sc.nextLine()),sc.nextLine());
            System.out.println(nv);
        }
    }
    
}
