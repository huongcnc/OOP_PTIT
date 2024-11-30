package BT.BanHang;

/**
 *
 * @author Hoàng Hướng
 */
public class MatHang {
    private String maMH,tenMH,donvi;
    private int giamua,giaban;
    private static int cnt=1;

    public MatHang(String tenMH, String donvi, int giamua, int giaban) {
        maMH = String.format("MH%03d",cnt);
        this.tenMH = tenMH;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return "k";
    }
    
    
    
}
