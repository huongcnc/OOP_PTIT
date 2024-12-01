package TH3;

import java.util.*;
import java.io.*;

/**
 *
 * @author Hoàng Hướng
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.parseInt(s);
            } catch(NumberFormatException a){
                try{
                    long m = Long.parseLong(s);
                    sum+=m;
                }catch(NumberFormatException b){
                    
                }
            }
        }
        System.out.print(sum);
        
    }
    
}
