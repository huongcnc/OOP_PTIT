package Xau;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J03040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int a[] = new int[5];
            for(int i=5;i<s.length();i++){
                if(i<8) a[i-5] = s.charAt(i)-'0';
                else if(i>8) a[i-6] = s.charAt(i)-'0';
            }
            if(check1(a)==true||check2(a)||check3(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean check1(int a[]) {
        for(int i=1;i<5;i++){
            if(a[i]<=a[i-1]) return false;
        }
        return true;
    }

    private static boolean check2(int[] a) {
        for(int i=1;i<3;i++){
            if(a[i]!=a[i-1]) return false;
        }
        if(a[3]!=a[4]) return false;
        return true;
    }

    private static boolean check3(int[] a) {
        for(int i=0;i<5;i++){
            if(a[i]!=8&&a[i]!=6) return false;
        }
        return true;
    }
    
}
