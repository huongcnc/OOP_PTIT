package TH1;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class Huong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ls = new ArrayList<>();
        ls.add(sc.next());
        ls.add(sc.next());
        for(String x:ls){
            System.out.printf("%s %d\n",np(x),res(x));
        }
       
    }
    public static String np(String s){
        String a = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'||s.charAt(i)=='1') a+=s.charAt(i);
        }
        return a;
    }
    public static long res(String s){
        s = np(s);
        long sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') sum+=Math.pow(2,s.length()-1-i);
        }
        return sum;
    }
    
}
