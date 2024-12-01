package TH3.B2;

import java.text.ParseException;
import java.util.*;

/**
 *
 * @author Hoàng Hướng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<CongNhan> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new CongNhan(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls);
        for(CongNhan x:ls){
            System.out.println(x);
        }
    }
    
}

