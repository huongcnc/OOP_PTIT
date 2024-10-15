package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class J07029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ls = (ArrayList<Integer>) in.readObject();
        int a[] = new int[1000000];
        for(int x:ls){
            if(snt(x)) a[x]++;
        }
        int cnt=10,i=999999;
        while(cnt>0){
            if(a[i]>0) {
                System.out.printf("%d %d\n", i,a[i]);
                cnt--;
            }
            i--;
        }
    }

    private static boolean snt(int x) {
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
    
}
