package KBLVDT.J04003;

/**
 *
 * @author Hoàng Hướng
 */
public class PhanSo {

    private long tu;
    private long mau;
    
    public PhanSo(long tu,long mau){
        this.tu = tu;
        this.mau = mau;
        reduce();
    }
    
    private void reduce(){
        long k = gcd(tu,mau);
        tu/=k;
        mau/=k;
    }

    private long gcd(long a, long b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }
    
    public String toString(){
        return String.format("%d/%d", tu,mau);
    }
    
}
    

