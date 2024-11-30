package TH2;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> d1 = (ArrayList<String>) in1.readObject();
        ArrayList<Integer> d2 = (ArrayList<Integer>) in2.readObject();
        
        Set<String> res = new TreeSet<>();
        for(String x:d1){
            for(int y:d2){
                res.add(x+y);
            }
        }
        for(String x:res){
            System.out.println(x);
        }
    }
    
}
