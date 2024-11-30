package KBLVDT.J04020;

/**
 *
 * @author Hoàng Hướng
 */
public class Pair<T,S> {
    private T first;
    private S second;
    
    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }
    
    private boolean snt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    
    public boolean isPrime(){
        return (snt((Integer) first)&&snt((Integer) second));
    }

    @Override
    public String toString() {
        return first + " "+ second;
    }
    
    
}