package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.Scanner;

public class J01010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(cat(n)==-1||cat(n)==0) System.out.println("INVALID");
            else System.out.println(cat(n));
        }
    }
    public static long cat(long n){
        String s = Long.toString(n);
        long res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') res=res*10+1;
            else if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9') res=res*10;
            else return -1;
        }
        return res;
    }
    
}