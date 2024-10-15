package KBLVDT.J07058;

/**
 *
 * @author Hoàng Hướng
 */

import java.io.*;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();sc.nextLine();
        DsMonHoc ds = new DsMonHoc(new ArrayList<>());
        while(t-->0){
            ds.getDs().add(new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        ds.sapXep();
        for(MonHoc x:ds.getDs()){
            System.out.printf("%s %s %s\n", x.getMa(),x.getTen(),x.getHt());
        }
    }
    
}
