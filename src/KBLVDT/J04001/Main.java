package KBLVDT.J04001;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;
import java.math.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point p1 = new Point (sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point (sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",Point.distance(p1, p2));
        }
    }
    
}
