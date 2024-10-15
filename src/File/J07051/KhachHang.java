package File.J07051;

/**
 *
 * @author Hoàng Hướng
 */
import java.time.*;
public class KhachHang {
    private String ma,ten,sophong,ngaynhan,ngaytra;
    private int tiendv;
    private static int cnt=1;

    public KhachHang(String ten, String sophong, String ngaynhan, String ngaytra, int tiendv) {
        ma = String.format("KH%02d",cnt);
        this.ten = ten;
        this.sophong = sophong;
        this.ngaynhan = ngaynhan;
        this.ngaytra = ngaytra;
        this.tiendv = tiendv;
        cnt++;
    }
    
    private int sno(){  
        LocalDate d1 = LocalDate.parse(ngaynhan);
        LocalDate d2 = LocalDate.parse(ngaytra);
        return Period.between(d1, d2).getDays();
    } 
    
    @Override
    public String toString() {
        return String.format("%s %s %s %d", args);
    }
    
    
    
    
    
}
