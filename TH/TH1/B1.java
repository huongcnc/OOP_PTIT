package TH1;

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
        int n = sc.nextInt();
        double a[] = new double[n];
        double max = 0, min = 10;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextDouble();
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        ArrayList<Double> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]!=max&&a[i]!=min) b.add(a[i]);
        }
        double sum = 0;
        for(double x:b) sum+=x;
        System.out.printf("%.2f", sum/b.size());
    }
    
}
