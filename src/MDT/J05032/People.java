package MDT.J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hoàng Hướng
 */
public class People implements Comparable<People> {
    private String ten;
    private Date ns;

    public People(String s) throws ParseException {
        String[] arr = s.trim().split("\\s+");
        ten = arr[0];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ns = sdf.parse(arr[1]);
    }
    @Override
    public int compareTo(People o){
        return o.ns.compareTo(ns);
    }

    @Override
    public String toString() {
        return ten;
    }
    
    
    
}
