package KBLVDT.J04004;

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
    
    public static PhanSo tong(PhanSo p1,PhanSo p2){
        return new PhanSo(p1.tu*p2.mau+p1.mau*p2.tu,p1.mau*p2.mau);
    }
    
    public String toString(){
        return String.format("%d/%d", tu,mau);
    }
    
}
    

