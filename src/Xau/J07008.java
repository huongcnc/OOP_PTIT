package Xau;



/**
 *
 * @author Hoàng Hướng
 */

import java.io.*;
import java.util.*;
import java.math.*;
public class J07008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Try(0);
        for(String x:res){
            System.out.println(x);
        }
    }
    static Set<String> res = new TreeSet<>();
    static int n;
    static int[] a,b;
    public static void Try(int t){
        for(int i=0;i<=1;i++){
            b[t]=i;
            if(t==n-1) in();
            else Try(t+1);
        }
    }

    private static void in() {
        Vector<Integer> v = new Vector<>();
        for(int i=0;i<n;i++) {
            if(b[i]==1) v.add(i);
        }
        if(v.size()<2) return;
        String s=Integer.toString(a[v.get(0)]);
        for(int i=1;i<v.size();i++){
            if(a[v.get(i)]<a[v.get(i-1)]) return;
            s = s + String.format(" %d", a[v.get(i)]);
        }
        res.add(s);
            
    }
}

