package BT.BanHang;

/**
 *
 * @author Hoàng Hướng
 */
import java.text.*;
import java.util.*;
public class KhachHang {
    private String maKH,tenKH,gioitinh,diachi;
    private Date ngaysinh;
    private int cnt = 1;

    public KhachHang(String tenKH, String gioitinh, String ngaysinh, String diachi) throws ParseException {
        maKH = String.format("KH%03d",cnt);
        cnt++;
        this.tenKH = tenKH;        
        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/yyyy");
        this.ngaysinh = sdf.parse(ngaysinh);
        this.diachi = diachi;
    }
    
    
    
}
