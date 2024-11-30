package TH2.B10;


/**
 *
 * @author Hoàng Hướng
 */
public class SanPham {
    private String maSP,tenSP;
    private int gia;
    private int thoihan;

    public SanPham(String maSP, String tenSP, int gia, int thoihan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.thoihan = thoihan;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGia() {
        return gia;
    }

    public int getThoihan() {
        return thoihan;
    }
    
    
}
