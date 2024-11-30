package MDT.J05024;

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
            String nganh = sc.nextLine().toUpperCase();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", nganh);
            for(SinhVien x:ls){
                if(x.checkNganh(nganh)) System.out.println(x);
            }
        }
    }
    
}


