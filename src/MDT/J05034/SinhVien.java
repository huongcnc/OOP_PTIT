package MDT.J05034;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien implements Comparable<SinhVien> {
    private String stt,ma,ten,lop,email,dn;
    private static int cnt = 1;

    public SinhVien(String ma, String ten, String lop, String email, String dn) {
        stt = Integer.toString(cnt++);
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    public boolean checkDN(String s){
        return s.equals(dn);
    }
    
    @Override
    public int compareTo(SinhVien o){
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", stt,ma,ten,lop,email,dn);
    }
    
}
