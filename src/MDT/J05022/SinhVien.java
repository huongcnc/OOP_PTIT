package MDT.J05022;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien {
    private String ma,ten,lop,email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public boolean checkLop(String lop){
        return this.lop.equals(lop);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma,ten,lop,email);
    }
    
}
