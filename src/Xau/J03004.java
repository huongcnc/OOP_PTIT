package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t-->0){
            String s= sc.nextLine().toLowerCase();
            for(int i=0;i<s.length();i++){
                int check=0;
                if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                    System.out.print((char)((int)s.charAt(i)-32));
                    check=1;
                    i++;
                }
                while(i<s.length()&&s.charAt(i)>='a'&&s.charAt(i)<='z'){
                    System.out.print(s.charAt(i));
                    i++;
                }
                if(check==1) System.out.print(" ");
            }
            System.out.println();
            
        }
    }
    
}
