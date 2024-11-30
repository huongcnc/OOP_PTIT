package TH2.B6;

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
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        ArrayList<SinhVien> ls = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            ls.add(new SinhVien(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        
        for(SinhVien x:ls) {
            System.out.println(x);
        }
    }
    
}
