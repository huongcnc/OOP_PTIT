package TH2;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class B8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));      
        int n = sc.nextInt();
        String s = sc.next();
        BigInteger max = new BigInteger(s);
        BigInteger min = new BigInteger(s);
        BigInteger sum = new BigInteger(s);
        
        while(n-->1){
            s = sc.next();
            BigInteger a = new BigInteger(s);
            max = max.max(a);
            min = min.min(a);
            sum = sum.add(a);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
    
}
