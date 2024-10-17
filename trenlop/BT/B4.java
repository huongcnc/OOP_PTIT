package BT;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
public class B4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> ls = new HashMap<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(ls.containsKey(n)) ls.put(n, ls.get(n)+1);
            else ls.put(n, 1);
            
        }
    }
    
}
