package File.J07037;

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
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> ls = new ArrayList<>();
        while(n-->0){
            ls.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ls,new Comparator<DoanhNghiep>(){
            public int compare(DoanhNghiep d1,DoanhNghiep d2){
                return d1.getMa().compareTo(d2.getMa());
            }
        });
        for(DoanhNghiep x:ls){
            System.out.println(x);
        }
    }
    
}
