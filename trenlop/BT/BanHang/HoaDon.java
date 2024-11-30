package BT.BanHang;

/**
 *
 * @author Hoàng Hướng
 */
public class HoaDon {
    private String maHD,maKH,mathang;
    private int soluong;
    private static int cnt=1;

    public HoaDon(String maHD, String maKH, String mathang, int soluong) {
        maHD = String.format("HD%03d",cnt);
        cnt++;
        this.maKH = maKH;
        this.mathang = mathang;
        this.soluong = soluong;
    }
    
    
}
