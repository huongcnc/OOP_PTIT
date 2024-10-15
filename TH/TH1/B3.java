package TH1;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int x = Integer.parseInt(s);
            } catch (NumberFormatException x1){
                    try{
                        long n = Long.parseLong(s);
                        sum+=n;
                    } catch (NumberFormatException x2){
                    
                    }
                   
            }
        }
        System.out.print(sum);  
    }
    
}
