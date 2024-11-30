package TH2.B10;

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
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        Map<String,SanPham> sp = new HashMap<>();
        ArrayList<KhachHang> lsKH = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            SanPham s = new SanPham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            sp.put(s.getMaSP(), s);
        }
        
        n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            lsKH.add(new KhachHang(sc.nextLine(),sc.nextLine(),sp.get(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(lsKH);
        for(KhachHang x:lsKH) {
            System.out.println(x);
        }
    }
    
}
