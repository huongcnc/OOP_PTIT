package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class J07007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> res = new TreeSet<>();
        while(sc.hasNextLine()){
            String []s = sc.nextLine().trim().toLowerCase().split("\\s+");
            for(String x:s){
                res.add(x);
            }
        }
        for(String x:res){
            System.out.println(x);
        }
    }
    
}
