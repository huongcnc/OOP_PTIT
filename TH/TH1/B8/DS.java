package TH1.B8;

/**
 *
 * @author Hoàng Hướng
 */
public class DS implements Comparable<DS> {
    private String msv, ten, lop,email,sdt;

    public DS(String msv, String ten, String lop, String email, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s 0%s",msv,ten,lop,email,sdt);
    }
    
    @Override
    public int compareTo(DS other){
        if(lop.equals(other.lop)) return msv.compareTo(other.msv);
        return lop.compareTo(other.lop);
    }
}
