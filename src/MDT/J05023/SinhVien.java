package MDT.J05023;

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
    public boolean checkKhoa(String khoa){
        return khoa.equals(String.format("20%s", ma.substring(1,3)));
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma,ten,lop,email);
    }
    
}
