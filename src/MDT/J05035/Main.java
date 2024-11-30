package MDT.J05035;

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
            ls.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.next();
            for(SinhVien x:ls){
                if(x.checkDN(s)) System.out.println(x);
            }
        }
        
    }
    
}

