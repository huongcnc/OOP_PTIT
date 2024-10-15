package KBLVDT.J04001;

/**
 *
 * @author Hoàng Hướng
 */

import java.math.*;

public class Point {
    private double x;
    private double y;
    
    public Point(){
        
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
     }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double distance(Point secondPoint){
        double X = secondPoint.x-x;
        double Y = secondPoint.y-y;
        return Math.sqrt(X*X+Y*Y);
    }
    
    public static double distance(Point p1, Point p2){
        double X = p1.x-p2.x;
        double Y = p1.y-p2.y;
        return Math.sqrt(X*X+Y*Y);
    }
    
    public String toString(){
        return String.format("%d %d",x,y);
    }
}
