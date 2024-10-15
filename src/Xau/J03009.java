package Xau;

/**
 *
 * @author Hoàng Hướng
 */

import java.util.*;

public class J03009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t-->0){
            String s1[] = sc.nextLine().trim().split("\\s+");
            String s2[] = sc.nextLine().trim().split("\\s+");
            Set<String> res = new HashSet();
            for(int i=0;i<s1.length;i++){
                boolean check=true;
                for(int j=0;j<s2.length;j++) {
                    if(s1[i].equals(s2[j])) check=false;
                }
                if(check==true) res.add(s1[i]);
            }
            for(String x:res){
                System.out.print(x+" ");
            }
            System.out.println();
            
        }
    }

    
}
