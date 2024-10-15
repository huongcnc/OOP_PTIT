package Mang;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;

public class J02017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(i<n-1&&(a[i]+a[i+1])%2==0) {
                i++;
            }
            else {
                if(st.empty()) st.push(a[i]);
                else {
                    if((st.peek()+a[i])%2==0) st.pop();
                    else st.push(a[i]);
                }
            }
        }
        System.out.print(st.size());
    }    
    
}
