package File;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;
import java.io.*;

public class J07004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> m = new HashMap<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(m.containsKey(n)) m.put(n, m.get(n)+1);
            else m.put(n, 1);
        }
        for(Integer x:m.keySet()){
            System.out.println(x +" "+ m.get(x));
        }
    }
    
}
