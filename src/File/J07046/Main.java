package File.J07046;

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
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<LuuTru> ls = new ArrayList<>();
        while(n-->0){
            ls.add(new LuuTru(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        for(LuuTru x:ls){
            System.out.println(x);
        }
    }
    
}
