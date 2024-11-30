package MDT.J05026;

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
        ArrayList<GiangVien> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new GiangVien(sc.nextLine(),sc.nextLine()));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", GiangVien.kyTu(s));
            for(GiangVien x:ls){
                if(x.checkBM(s)) System.out.println(x);
            }
        }
    }
    
}
