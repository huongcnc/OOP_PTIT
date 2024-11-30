package MDT.J05045;

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
        ArrayList<NhanVien> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new NhanVien(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ls);
        for(NhanVien x : ls){
            System.out.println(x);
        }
    }
    
}

