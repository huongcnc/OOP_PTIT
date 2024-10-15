package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[s.length()];
        for(int i=1;i<s.length();i++){
            int j=i-1;
            while(j>=0&&a[j]==1) j--;
            if(j==-1) continue;
            if(s.charAt(i)==s.charAt(j)) {
                a[i]=a[j]=1;
            }
        }
        int check=1;
        for(int i=0;i<s.length();i++){
            if(a[i]==0) {
                check=0;
                System.out.print(s.charAt(i));
            }
        }
        if(check==1) System.out.print("Empty String");
    }

}
