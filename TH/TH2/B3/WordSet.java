package TH2.B3;

import java.util.*;

/**
 *
 * @author Hoàng Hướng
 */
public class WordSet {
    private String[] s;

    public WordSet(String s) {
        this.s = s.trim().toLowerCase().split("\\s+");
    }
    
    public String union(WordSet o){
        Set<String> a = new TreeSet();
        for(String x:s){
            a.add(x);
        }
        for(String x:o.s){
            a.add(x);
        }
        String res = "";
        for(String x:a){
            res += x + " ";
        }
        return res;
    }
    
    public String intersection(WordSet o){
        Set<String> a1 = new TreeSet<>();
        Set<String> a2 = new TreeSet<>();
        for(String x:s){
            a1.add(x);
        }
        for(String x:o.s){
            a2.add(x);
        }
        Set<String> giao = new TreeSet<>();
        giao.addAll(a1);
        giao.retainAll(a2);
        String res = "";
        for(String x:giao){
            res += x + " ";
        }
        return res;
    }
}
