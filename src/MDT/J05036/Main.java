package MDT.J05036;


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
        int t = sc.nextInt();
        while(t-->0){
            ls.add(new MatHang(sc.next(),sc.next(),sc.nextInt(),sc.nextInt()));
        }
        for(MatHang x:ls){
            System.out.println(x);
        }
    }
    
}

