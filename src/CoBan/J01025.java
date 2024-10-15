package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xmax = sc.nextInt(), ymax = sc.nextInt();
        int xmin = xmax,ymin = ymax;
        for(int i=0;i<3;i++){
            int x = sc.nextInt(),y = sc.nextInt();
            xmax = Math.max(xmax, x);
            xmin = Math.min(xmin, x);
            ymax = Math.max(ymax, y);
            ymin = Math.min(ymin, y);
        }
        int c = Math.max(Math.abs(xmax-xmin), Math.abs(ymax-ymin));
        System.out.print(c*c);
    }
    
}
