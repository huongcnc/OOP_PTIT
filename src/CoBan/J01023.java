package CoBan;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.ArrayList;
import java.util.Scanner;


public class J01023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            check = false;
            char s[] = sc.nextLine().toCharArray();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int i=0;i<s.length;i++){
                if(s[i]=='?') a.add(i);
            }
            Try(s,a,0);
            if(check==true) System.out.println(s);
            else System.out.println("WRONG PROBLEM!");
        }
        
    }
    static char dau[] = {'+','-','*','/'};
    static boolean check=false;
    public static void Try(char s[],ArrayList<Integer> a,int t){
        if(a.size()==0) {
            check=cr(s);
            return;
        }
        if(a.get(t)==3){
            for(int i=0;i<4;i++){
                if(check==true) return;
                s[a.get(t)]=dau[i];
                if(t==a.size()-1) check=cr(s);
                else Try(s,a,t+1);
            }
        } else{
            for(int i=0;i<=9;i++){
                if(check==true) return;
                s[a.get(t)]=String.valueOf(i).charAt(0);
                if(t==a.size()-1) check=cr(s);
                else Try(s,a,t+1);
            }
        }
    }
    public static boolean cr(char s[]){
        int a[]= new int[3];
        for(int i=0;i<3;i++){
            if(s[i*5]=='0') return false;
            a[i]=(s[i*5]-'0')*10+s[i*5+1]-'0';
        }
        if(s[3]=='+'&&a[0]+a[1]==a[2]) return true;
        if(s[3]=='-'&&a[0]-a[1]==a[2]) return true;
        if(s[3]=='*'&&a[0]*a[1]==a[2]) return true;
        return false;
    }
    
}
