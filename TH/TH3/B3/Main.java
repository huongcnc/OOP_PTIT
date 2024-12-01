package TH3.B3;

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
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> ls = new ArrayList<>();
        while(sc.hasNextLine()){
            ls.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        for(SinhVien x:ls){
            System.out.println(x);
        }
    }
    
}
