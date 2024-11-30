package MDT.J05010;

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
        ArrayList<MatHang> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new MatHang(sc.nextLine(),sc.nextLine(),
            Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ls);
        for(MatHang x:ls){
            System.out.println(x);
        }
    }
    
}
