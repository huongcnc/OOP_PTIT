package KBLVDT.J04008;

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
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
            double a = Point.distance(p1, p2);
            double b = Point.distance(p1, p3);
            double c = Point.distance(p3, p2);
            if(a+b>c&&a+c>b&&b+c>a){
                System.out.printf("%.3f\n",a+b+c);
            } else System.out.println("INVALID");
            
        }
    }
    
}
