package File.J07034;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> ls = new ArrayList<>();
        while(n-->0){
            ls.add(new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ls,new Comparator<MonHoc>(){
            public int compare(MonHoc m1,MonHoc m2){
                return m1.getTen().compareTo(m2.getTen());
            }
        });
        for(MonHoc x:ls){
            System.out.println(x.toString());
        }
    }
    
}
