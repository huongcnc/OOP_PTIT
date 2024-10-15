package Mang;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J02006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int a[] = new int[n], b[] = new int[m];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for(int i=0;i<m;i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        A.add(a[0]);
        B.add(b[0]);
        for(int i=1;i<n;i++) {
            if(a[i]!=a[i-1]) A.add(a[i]);
        }
        for(int i=1;i<m;i++) {
            if(b[i]!=b[i-1]) B.add(b[i]);
        }
        int i=0,j=0;
        while(i<A.size()&&j<B.size()){
            if(A.get(i)>B.get(j)){
                System.out.print(B.get(j)+" ");
                j++;
            }
            else if(A.get(i)<B.get(j)){
                System.out.print(A.get(i)+" ");
                i++;
            }
            else {
                System.out.print(A.get(i)+" ");
                i++;
                j++;
            }
        }
        while(i<A.size()){
            System.out.print(A.get(i)+" ");
            i++;
        }
            
        while(j<B.size()){
            System.out.print(B.get(j)+" ");
            j++;
        }
    }
}
