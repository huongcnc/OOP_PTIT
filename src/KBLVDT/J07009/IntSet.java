package KBLVDT.J07009;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Hoàng Hướng
 */
public class IntSet {
    private int[] n;

    public IntSet(int[] n) {
        Set<Integer> s = new TreeSet<>();
        for(int x:n) s.add(x);
        this.n = new int[s.size()];
        int i=0;
        for(int x:s) this.n[i++]=x;
    }
    
    public IntSet union(IntSet o){
        ArrayList<Integer> u = new ArrayList<>();
        int i=0,j=0;
        while(i<n.length&&j<o.n.length){
            if(n[i]>o.n[j]) u.add(o.n[j++]);
            else if (n[i]<o.n[j]) u.add(n[i++]);
            else {
                u.add(o.n[j]);
                i++;
                j++;
            }
        }
        while(i<n.length) u.add(n[i++]);
        while(j<o.n.length) u.add(o.n[j++]);
        int[] res = new int[u.size()];
        for(i=0;i<res.length;i++){
            res[i]=u.get(i);
        } 
        return new IntSet(res);
    }
    public IntSet intersection(IntSet o){
        ArrayList<Integer> u = new ArrayList<>();
        int i=0,j=0;
        while(i<n.length&&j<o.n.length){
            if(n[i]>o.n[j]) j++;
            else if (n[i]<o.n[j]) i++;
            else {
                u.add(o.n[j]);
                i++;
                j++;
            }
        }
        int[] res = new int[u.size()];
        for(i=0;i<res.length;i++){
            res[i]=u.get(i);
        } 
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String s ="";
        for(int x:n){
            s += x + " ";
        }
        return s;
    }
    
}
