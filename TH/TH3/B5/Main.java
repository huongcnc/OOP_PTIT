package TH3.B5;

import java.io.*;
import java.util.*;

/**
 *
 * @author Hoàng Hướng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("GIANGVIEN.in"));
        Scanner in2 = new Scanner(new File("GIOCHUAN.in"));
        ArrayList<GiangVien> gv = new ArrayList<>();
        ArrayList<GioChuan> gc = new ArrayList<>();
        int t = Integer.parseInt(in2.nextLine());
        while(t-->0){
            gc.add(new GioChuan(in2.nextLine()));
        }
        t = Integer.parseInt(in1.nextLine());
        while(t-->0){
            gv.add(new GiangVien(in1.nextLine(),gc));
        }
        for(GiangVien x:gv){
            System.out.println(x);
        }
    }
    
}
