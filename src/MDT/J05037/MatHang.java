package MDT.J05037;

/**
 *
 * @author Hoàng Hướng
 */
public class MatHang implements Comparable<MatHang> {
    private String ma,ten,dv;
    private int gianhap,sl;
    private static int cnt =1;

    public MatHang(String ten, String dv, int gianhap, int sl) {
        ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.dv = dv;
        this.gianhap = gianhap;
        this.sl = sl;
    }
    
    private double phiVanChuyen(){
        return (double)gianhap*sl*5/100;
    }
    private double thanhTien(){
        return (double)gianhap*sl+phiVanChuyen();
    }
    private double giaBan(){
        return thanhTien()*1.02/sl;
    }
    
    private long lamTronGiaBan(){
        long n = (long) giaBan()/100;
        if((double)n == giaBan()/100) return n*100;
        return (n+1)*100;
    } 
    @Override
    public int compareTo(MatHang o){
        return Double.compare(o.giaBan(), giaBan());
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d",ma,ten,dv, Math.round(phiVanChuyen()),
                Math.round(thanhTien()),lamTronGiaBan());
    }
    
}
