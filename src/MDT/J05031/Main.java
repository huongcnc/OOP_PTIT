package MDT.J05031;

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
        ArrayList<SinhVien> ls  =  new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),
            Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ls);
        int cnt=1;
        for(SinhVien x:ls){
            System.out.println(Integer.toString(cnt++) + " " + x);
        }
    }
    
}
