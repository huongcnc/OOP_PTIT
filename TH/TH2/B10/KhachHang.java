package TH2.B10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Hoàng Hướng
 */
public class KhachHang implements Comparable<KhachHang> {
    private String maKH,tenKH,dc;
    private SanPham sp;
    private int sl;
    private Date ngaymua;
    private static int cnt=1;

    public KhachHang(String tenKH, String dc, SanPham sp, int sl, String ngaymua) throws ParseException {
        maKH = String.format("KH%02d", cnt++);
        this.tenKH = tenKH;
        this.dc = dc;
        this.sp = sp;
        this.sl = sl;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
        this.ngaymua = df.parse(ngaymua);
    }
    
    private Date ngayHetHan(){
        Calendar cd = Calendar.getInstance();
        cd.setTime(ngaymua);
        cd.add(Calendar.MONTH,sp.getThoihan());
        return cd.getTime();
    }
    
    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
        return maKH + " " + tenKH + " " + dc + " " + sp.getMaSP() + " " + 
               sl*sp.getGia() + " " + df.format(ngayHetHan());
    }
    
    @Override
    public int compareTo(KhachHang o){
        return ngayHetHan().compareTo(o.ngayHetHan());
    }
    
}
