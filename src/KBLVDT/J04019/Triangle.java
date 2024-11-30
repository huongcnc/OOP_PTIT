package KBLVDT.J04019;

/**
 *
 * @author Hoàng Hướng
 */
public class Triangle {
    private Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        double x = a.distance(b);
        double y = a.distance(c);
        double z = b.distance(c);
        return ((x+y>z)&&(x+z>y)&&(y+z>x));
    }
    public double getPerimeter(){
        double x = a.distance(b);
        double y = a.distance(c);
        double z = b.distance(c);
        double p = x + y + z;
        return Double.parseDouble(String.format("%.3f",p));
    }
}
