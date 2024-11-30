package TH2.B7;

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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> ls = new ArrayList<>();
        Set<String> check = new HashSet<>();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(check.contains(s)) {
                sc.nextLine();
                sc.nextLine();
                continue;
            }
            check.add(s);
            ls.add(new MonHoc(s,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        
        for(MonHoc x:ls){
            System.out.println(x);
        }
    }
    
}
