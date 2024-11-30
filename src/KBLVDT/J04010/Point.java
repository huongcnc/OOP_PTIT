package KBLVDT.J04010;

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
    
    public static boolean check(Point p1,Point p2,Point p3){
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        return (a+b>c)&&(a+c>b)&&(b+c>a);
        
    }
    
    public static double dientich(Point p1,Point p2,Point p3){
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
    }
    
    public static double dientichdtnt(Point p1,Point p2,Point p3){
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        double r = a*b*c/(4*dientich(p1,p2,p3));
        return r*r*Math.PI;
        
    }
}
