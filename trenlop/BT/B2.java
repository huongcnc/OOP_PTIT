package BT;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ArrayList<String> ls = new ArrayList<>(Arrays.asList(sc.nextLine().trim().split("\\s+")));
            Collections.reverse(ls);
            for(String x:ls) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        
    }
    
}
