package TH2;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class B5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ls =(ArrayList<String>) in.readObject();
        Set<Integer> res = new TreeSet<>();
        for(String x:ls){
            String[] arr = x.trim().split("\\s+");
            for(String y:arr){
                try{
                int n = Integer.parseInt(y);
                res.add(n);
                } catch(NumberFormatException e){
                    
                }
        }      
        } 
        
        
        
        for(int x:res) {
            System.out.println(x);
        }
    }
}
    

