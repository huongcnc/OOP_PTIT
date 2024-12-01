package TH3.B3;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien implements Comparable<SinhVien> {
    private String ma,ten,lop,email,sdt;

    public SinhVien(String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    
    @Override
    public int compareTo(SinhVien o){
        if(lop.equals(o.lop)) return ma.compareTo(o.ma);
        return lop.compareTo(o.lop);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", ma,ten,lop,email,sdt);
    }
    
    
    
    
    
}
