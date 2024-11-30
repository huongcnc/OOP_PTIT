package File.J07051;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ls = new ArrayList<>();
        while(n-->0){
            ls.add(new KhachHang(sc.nextLine(),sc.nextLine(),sc.nextLine(),
            sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        
        Collections.sort(ls);
        for(KhachHang x:ls){
            System.out.println(x);
        }
    }
    
}
