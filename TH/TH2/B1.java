package TH2;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;

public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        
        Set<Integer> giao = new TreeSet<>(a);
        Set<Integer> hieua = new TreeSet<>(a);
        Set<Integer> hieub = new TreeSet<>(b);
        giao.retainAll(b);
        hieua.removeAll(b);
        hieub.removeAll(a);
        
        for(int x:giao){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x:hieua){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x:hieub){
            System.out.print(x + " ");
        }
        
    }
    
}
