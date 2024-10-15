package TH1;

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
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> ls = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> res = new TreeSet<>();
        for(int  x:ls){
            if(x>=100&&snt(x)) res.add(x);
        }
        for(int x:res) System.out.println(x);
    }

    private static boolean snt(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
        
    }
    
}
