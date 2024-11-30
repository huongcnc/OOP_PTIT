package TH2.B4;

/**
 *
 * @author Hoàng Hướng
 */
public class Pair<T1 extends Comparable<T1>,T2 extends Comparable<T2>> implements Comparable<Pair<T1,T2>> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ')';
    }
    @Override
    public int compareTo(Pair<T1,T2> o){
        if(first.compareTo(o.first)!=0) return first.compareTo(o.first);
        return second.compareTo(o.second);
    }
    
}
