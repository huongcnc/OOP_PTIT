package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class J07031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ls1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> ls2 = (ArrayList<Integer>) in2.readObject();
        int a1[] = new int[1000000];
        int a2[] = new int[1000000];
        for(int x:ls1){
            if(snt(x)) a1[x]++;
        }
        for(int x:ls2){
            if(snt(x)) a2[x]++;
        }
        for(int i=2;i<1000000/2;i++){
            if(a1[i]>0&&a1[1000000-i]>0&&a2[i]==0&&a2[1000000-i]==0){
                System.out.printf("%d %d\n", i,1000000-i);
            }
        }
    }

    private static boolean snt(int x) {
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
    
}
