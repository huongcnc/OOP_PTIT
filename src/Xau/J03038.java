package Xau;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J03038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']=1;
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(a[i]==1) cnt++;
        }
        System.out.print(cnt);
    }
    
}
