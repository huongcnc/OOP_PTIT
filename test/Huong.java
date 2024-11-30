package TH1;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Huong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse("08/03/2010",formatter);
        LocalDate d2 = LocalDate.parse("01/05/2010",formatter);
        System.out.print(Period.between(d1, d2).getYears());
       
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
