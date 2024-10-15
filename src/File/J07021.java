package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;

public class J07021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            String [] a = s.trim().toLowerCase().split("\\s+");
            for(String x:a){
                System.out.print(x.substring(0, 1).toUpperCase()+x.substring(1)+" ");
            }
            System.out.println();
        }
    }
    
}
