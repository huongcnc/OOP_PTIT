package MDT.J05033;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThoiGian> ds = new ArrayList<>();
        while(n-->0){
            ds.add(new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(ds,new Comparator<ThoiGian>(){
            public int compare(ThoiGian t1,ThoiGian t2){
                return Integer.compare(t1.getTongGiay(), t2.getTongGiay());
            }
        });
        for(ThoiGian x:ds){
            System.out.println(x.toString());
        }
    }
    
}
