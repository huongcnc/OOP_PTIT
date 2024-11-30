package MDT.J04018;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            SoPhuc a = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(),sc.nextInt());
            SoPhuc c = a.sum(b).mul(a);
            SoPhuc d = a.sum(b).mul(a.sum(b));
            System.out.println(c + ", "+d);
        }
        
    }
    
}
