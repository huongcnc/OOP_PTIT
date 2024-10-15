package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='4'||str.charAt(i)=='7') cnt++;
        }
        if(cnt==4||cnt==7) System.out.print("YES");
        else System.out.print("NO");
    }
    
}
