package MDT.J05022;

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
        ArrayList<SinhVien> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String lop = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", lop);
            for(SinhVien x:ls){
                if(x.checkLop(lop)) System.out.println(x);
            }
        }
    }
    
}

