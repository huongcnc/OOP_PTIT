package TH1;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class B7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> ls = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)) ls.add(s);
        }
        for(String x:ls) System.out.println(x);
        
    }
    public static boolean check(String s){
        boolean c = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9') c=true;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'||s.charAt(i)=='!'||s.charAt(i)=='?'||s.charAt(i)==':'||s.charAt(i)==',') c=false;
        }
        return c;
    }
    
}
