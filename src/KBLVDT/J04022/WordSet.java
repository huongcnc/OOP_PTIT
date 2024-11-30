package KBLVDT.J04022;

import java.util.*;



/**
 *
 * @author Hoàng Hướng
 */
public class WordSet {
    String[] s;

    public WordSet(String a) {
        s = a.toLowerCase().trim().split("\\s+");
        Arrays.sort(s);
    }
    
    public WordSet union(WordSet o){
        String res="";
        Set<String> u = new HashSet<>();
        for(String x:s) u.add(x);
        for(String x:o.s) u.add(x);
        for(String x:u) res += x + " ";
        return new WordSet(res);
    }
    
    public WordSet intersection(WordSet o){
        String res="";
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        for(String x:o.s) s1.add(x);
        for(String x:s) s2.add(x);
        for(String x:s1){
            if(s2.contains(x)) res += x + " ";
        }
        return new WordSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(String x:s) res += x + " ";
        return res;
    }
    
    
    
}
