package MDT.J05023;

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
            String khoa = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", khoa);
            for(SinhVien x:ls){
                if(x.checkKhoa(khoa)) System.out.println(x);
            }
        }
    }
    
}


