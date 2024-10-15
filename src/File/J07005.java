package File;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;
import java.io.*;

public class J07005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1001];
        for(int i=0;i<100000;i++){
            a[in.readInt()]++;
        }        
        for(int i=0;i<=1000;i++){
            if(a[i]>0) System.out.printf("%d %d\n",i,a[i]);
        }
    }
    
}
