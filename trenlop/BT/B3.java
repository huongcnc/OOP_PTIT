package BT;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Set<Integer> odd = new TreeSet<>(Comparator.reverseOrder());
            Set<Integer> even = new TreeSet<>();
            while(n-->0){
                int a = sc.nextInt();
                if(a%2==0) even.add(a);
                else odd.add(a);
            }
            for(int x:even) {
                System.out.print(x+" ");
            }
            System.out.println();
            for(int x:odd) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        
    }
    
}
