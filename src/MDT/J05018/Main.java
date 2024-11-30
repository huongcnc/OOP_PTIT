package MDT.J05018;

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
        ArrayList<HocSinh> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new HocSinh(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        for(HocSinh x:ls){
            System.out.println(x);
        }
    }
    
}
