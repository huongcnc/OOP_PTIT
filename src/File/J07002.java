package File;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;
import java.io.*;

public class J07002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(true){
            if(sc.hasNextInt()) sum+=(long)sc.nextInt();
            else if(sc.hasNext()) sc.next();
            else break;
        }
        System.out.print(sum);
    }
    
}
