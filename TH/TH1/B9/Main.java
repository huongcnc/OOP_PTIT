package TH1.B9;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> ls = new ArrayList<>();
        while(n-->0){
            ls.add(new SV(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        for(SV x:ls) System.out.println(x);
    }
    
}
