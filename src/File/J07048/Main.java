package File.J07048;

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
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> ls = new ArrayList<>();
        while(n-->0){
            ls.add(new SanPham(sc.nextLine(),sc.nextLine(),
                Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ls);
        for(SanPham x:ls){
            System.out.println(x);
        }
        
    }
    
}
