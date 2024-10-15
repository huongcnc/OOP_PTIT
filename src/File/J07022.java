package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class J07022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> ls = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.parseInt(s);
            } catch (NumberFormatException a){
                ls.add(s);
            }
        }
        Collections.sort(ls,new Comparator<String>(){
            public int compare(String s1,String s2){
                return s1.compareTo(s2);
            }
        });
        for(String x:ls){
            System.out.print(x+" ");
        }
    }
    
}
