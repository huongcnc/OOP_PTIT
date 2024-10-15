package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class J07015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>)in.readObject();
        int a[] = new int[10000];
        for(int x:ds){
            if(snt(x)) a[x]++;
        }
        for(int i=0;i<10000;i++){
            if(a[i]>0) System.out.printf("%d %d\n", i,a[i]);
        }
    }
    public static boolean snt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>=2;
    }
}
