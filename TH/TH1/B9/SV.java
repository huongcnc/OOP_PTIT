package TH1.B9;

/**
 *
 * @author Hoàng Hướng
 */
public class SV implements Comparable<SV> {
    private String ten;
    private int submit,ac;

    public SV(String ten, String s) {
        this.ten = ten;
        String a[] = s.trim().split("\\s+");
        ac = Integer.parseInt(a[0]);
        submit = Integer.parseInt(a[1]);
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",ten,ac,submit);
    }
    
    
    @Override
    public int compareTo(SV other){
        if(ac!=other.ac) return Integer.compare(other.ac, ac);
        if(submit!=other.submit) return Integer.compare(submit, other.submit);
        return ten.compareTo(other.ten);
    }
    
}
