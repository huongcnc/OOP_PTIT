package KBLVDT.J04002;

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
        Rectange rec = new Rectange(sc.nextDouble(),sc.nextDouble(),sc.next());
        if(rec.getHeight()<=0||rec.getWidth()<=0) {
            System.out.print("INVALID");
            return;
        }
        Rectange.setColor(Rectange.getColor().substring(0,1).toUpperCase()+Rectange.getColor().substring(1,Rectange.getColor().length()).toLowerCase());
        System.out.printf("%.0f %.0f %s",rec.findPerimeter(),rec.findArea(),Rectange.getColor());
    }
    
}
