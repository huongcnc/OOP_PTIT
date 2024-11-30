package MDT.J05032;

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
        ArrayList<People> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ls.add(new People(sc.nextLine()));
        }
        Collections.sort(ls);
        System.out.println(ls.get(0));
        System.out.println(ls.get(ls.size()-1));
    }
    
}
