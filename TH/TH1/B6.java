package TH1;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class B6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String,Integer> ls = new HashMap<>();
        Set<String> ls1 = new HashSet<>();
        while(sc.hasNextLine()){
            String []s = sc.nextLine().trim().toLowerCase().split("\\s+");
            String ten = "";
            for(String x:s) ten+=x;
            String res = s[s.length-1];
            for(int i=0;i<s.length-1;i++) res+=s[i].charAt(0);
            if(ls1.contains(ten)) continue;
            ls1.add(ten);
            if(!ls.containsKey(res)) {
                ls.put(res, 1);
                System.out.println(res+"@ptit.edu.vn");
            }
            else {
                ls.put(res, ls.get(res)+1);
                System.out.println(res+ls.get(res)+"@ptit.edu.vn");
            }
            
        
        }
        
    }
    
}
