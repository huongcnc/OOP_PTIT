package TH2.B9;

/**
 *
 * @author Hoàng Hướng
 */
public class DangKy {
    private String ma, size;

    public DangKy(String s) {
        String[] a = s.trim().split("\\s+");
        ma = a[0];
        size = a[1];
    }

    public String getMa() {
        return ma;
    }

    public String getSize() {
        return size;
    }
    
    
}
