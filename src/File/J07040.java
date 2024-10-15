package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class J07040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner in2 = new Scanner(new File("VANBAN.in"));
        ArrayList<String> ls = (ArrayList<String>) in1.readObject();
        ArrayList<String> ls1 = new ArrayList<>();
        ArrayList<String> ls2 = new ArrayList<>();
        for(String x:ls){
            String[]s=x.trim().split("\\s+");
            for(String y:s) ls1.add(y);
        }
        while(in2.hasNext()) ls2.add(in2.next());
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new LinkedHashSet<>();
        for(String x:ls1) s1.add(x.toLowerCase());
        for(String x:ls2) s2.add(x.toLowerCase());
        for(String x:s2){
            if(s1.contains(x)) System.out.println(x);
        }
    }
    
}
