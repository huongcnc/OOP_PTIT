package KBLVDT.J04010;

/**
 *
 * @author Hoàng Hướng
 */
import java.io.*;
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
            if(Point.check(p1, p2, p3)) System.out.printf("%.3f\n", Point.dientichdtnt(p1, p2, p3));
            else System.out.println("INVALID");
        }
    }
    
}
