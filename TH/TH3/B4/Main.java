package TH3.B4;

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
        Scanner in1 = new Scanner(new File("BAITAP.in"));
        Scanner in2 = new Scanner(new File("BAOCAO.in"));
        ArrayList<BaiTap> ls = new ArrayList<>();
        Map<String,String> bc = new HashMap<>();
        while(in2.hasNextLine()){
            bc.put(in2.nextLine(),in2.nextLine() );
        }
        while(in1.hasNextLine()){
            ls.add(new BaiTap(in1.nextLine(),in1.nextLine(),in1.nextLine(),bc));
        }
        Collections.sort(ls);
        System.out.printf("DANH SACH SINH VIEN BAO CAO CA SANG: %d\n", BaiTap.cnt1);
        for(BaiTap x:ls){
            
            if(x.check("SANG")) System.out.println(x);
        }
        System.out.printf("\nDANH SACH SINH VIEN BAO CAO CA CHIEU: %d\n", BaiTap.cnt2);
        for(BaiTap x:ls){
            
            if(x.check("CHIEU")) System.out.println(x);
        }
    }
    
}
