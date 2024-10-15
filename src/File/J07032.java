package File;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class J07032 {

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
            if(stn(x)) a1[x]++;
        }
        for(int x:ls2){
            if(stn(x)) a2[x]++;
        }
        int cnt=10;
        for(int i=1;i<1000000;i+=2){
            if(cnt==0) break;
            if(a1[i]>0&&a2[i]>0){
                System.out.printf("%d %d\n", i,a1[i]+a2[i]);
                cnt--;
            }
        }
    }

    private static boolean stn(int x) {
        String s = Integer.toString(x);
        if(s.length()<=1||s.length()%2==0) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)||(s.charAt(i)-'0')%2==0) return false;
        }
        return true;
    }
    
    
}
