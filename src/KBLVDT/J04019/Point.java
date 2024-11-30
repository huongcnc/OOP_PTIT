package KBLVDT.J04019;

import java.util.Scanner;

/**
 *
 * @author Hoàng Hướng
 */
public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point o){
        return Math.sqrt((x-o.x)*(x-o.x)+(y-o.y)*(y-o.y));
    }
    
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }
    
}
