package MDT.J05081;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSMatHang dsmh = new DSMatHang (new ArrayList<MatHang>());
        int n = sc.nextInt();
        while(n-->0){
            sc.nextLine();
            dsmh.getDsmh().add(new MatHang(sc.nextLine(),sc.next(),sc.nextInt(),sc.nextInt()));
        }
        dsmh.SapXep();
        for(MatHang x:dsmh.getDsmh()){
            System.out.println(x.toString());
        }
        
    }
    
}
