package File.J07010;

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
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien x:ds){
            System.out.println(x.toString());
        }
    }
    
}
