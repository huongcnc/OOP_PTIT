package TH1;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int e[] = new int[m];
        for(int i=0;i<m;i++) e[i] = sc.nextInt();
        System.out.print("Errors: ");
        StringBuilder res = new StringBuilder();
        boolean check = false;
        int er;
        int i=0;
        for(;i<m-1;i++){
            res.append(e[i]);
            if(e[i+1]-e[i]==1){
                check = true;
                res.append("-");
                er = i+1;
                for(int j=er;j<m-1;j++){
                    if(e[j+1]-e[j]==1){
                        er = j+1;
                    }
                    else break;
                }
                i=er;
                res.append(e[er]+", ");
            } else {
                res.append(", ");
            }
        }
        if(e[m-1]-e[m-2]!=1){
            res.delete(res.length()-2,res.length());
            res.append(" and "+e[m-1]);
        } else {
            res.delete(res.length()-2,res.length());
            StringBuilder lst = new StringBuilder();
            int k=res.length()-1;
            while(res.charAt(k)!=',') k--;
            lst.append(res.substring(k+2));
            res.delete(k, res.length());
            res.append(" and "+lst.toString());
        }
        System.out.println(res.toString());
        
        int h = n-m;
        int c[] = new int [h];
        
        int ide=0,idc=0;
        for(int j=1;j<=n;j++){
            if(ide<m&&j==e[ide]) ide++;
            else {
                c[idc] = j;
                idc++;
            } 
        }
        
        System.out.print("Correct: ");
        res = new StringBuilder();
        check = false;
        er = 0;
        i=0;
        for(;i<h-1;i++){
            res.append(c[i]);
            if(c[i+1]-c[i]==1){
                check = true;
                res.append("-");
                er = i+1;
                for(int j=er;j<h-1;j++){
                    if(c[j+1]-c[j]==1){
                        er = j+1;
                    }
                    else break;
                }
                i=er;
                res.append(c[er]+", ");
            } else {
                res.append(", ");
            }
        }
        if(c[h-1]-c[h-2]!=1){
            res.delete(res.length()-2,res.length());
            res.append(" and "+c[h-1]);
        } else {
            res.delete(res.length()-2,res.length());
            StringBuilder lst = new StringBuilder();
            int k=res.length()-1;
            while(res.charAt(k)!=',') k--;
            lst.append(res.substring(k+2));
            res.delete(k, res.length());
            res.append(" and "+lst.toString());
        }
        System.out.println(res.toString());
        
    }
    
}
