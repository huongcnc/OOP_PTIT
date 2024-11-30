package KBLVDT.J04014;

/**
 *
 * @author Hoàng Hướng
 */
public class PhanSo {
    private long tu,mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }
    
    private long gcd(long a,long b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    
    private void rutGon(){
        long x = gcd(Math.abs(tu),Math.abs(mau));
        tu/=x;
        mau/=x;
        if(mau<0) {
            mau = -mau;
            tu = -tu;
        }
    }
    
    public PhanSo congPhanSo(PhanSo o){
        long tu = this.tu*o.mau+o.tu*this.mau;
        long mau = this.mau*o.mau;
        return new PhanSo(tu,mau);
    }
    
    public PhanSo nhanPhanSo(PhanSo o){
        return new PhanSo(tu*o.tu,mau*o.mau);
    }
    
    @Override
    public String toString() {
        return tu + "/"+mau;
    }
    
}
