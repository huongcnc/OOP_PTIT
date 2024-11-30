package MDT.J05009;

import java.util.*;

/**
 *
 * @author Hoàng Hướng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ls = new ArrayList<>();
        while(t-->0){
            ls.add(new SinhVien(sc.nextLine(),sc.nextLine(),
            Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien x:ls){
            if(x.check()) System.out.println(x);
        }
    }
    
}
