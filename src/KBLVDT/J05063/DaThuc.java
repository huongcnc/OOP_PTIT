package KBLVDT.J05063;

import java.util.*;

/**
 *
 * @author Hoàng Hướng
 */
public class DaThuc {
    Map<String,Integer> dt;
    
    public DaThuc(String s) {
        String[] a = s.trim().split("\\s+");
        dt = new TreeMap<>(Comparator.reverseOrder());
        for(int i=0;i<a.length;i+=2){
            int j=0;
            while(a[i].charAt(j)!='*') j++;
            String x = a[i].substring(j+1);
            int y = Integer.parseInt(a[i].substring(0,j));
            if(y==0) continue;
            dt.put(x,y);
        }
    }
    
    public DaThuc cong(DaThuc o){
        DaThuc res = new DaThuc(o.toString());
        for(String x:dt.keySet()){
            if(res.dt.containsKey(x)) res.dt.put(x,dt.get(x)+res.dt.get(x));
            else res.dt.put(x, dt.get(x));
        }
        return res;
        
    }

    @Override
    public String toString() {
        String res = "";
        boolean check=true;
        for(String x:dt.keySet()){
            if(check) {
                res += String.format("%d*%s ", dt.get(x),x);
                check = false;
            } else {
                res += String.format("+ %d*%s ", dt.get(x),x);
            }
            
        }
        return res;
    }
    
    
    
}
