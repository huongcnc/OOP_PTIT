package TH2.B4;

/**
 *
 * @author Hoàng Hướng
 */
import java.io.*;
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(sc.nextInt()==1 && j>i) arr.add(new Pair(i+1,j+1));
            }
        }
        Collections.sort(arr);
        for(Pair p:arr){
            System.out.println(p);
        }
    }
    
}
