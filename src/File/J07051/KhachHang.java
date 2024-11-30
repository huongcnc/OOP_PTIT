package File.J07051;

/**
 *
 * @author Hoàng Hướng
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class KhachHang implements Comparable<KhachHang> {
    private String ma,ten,sophong,ngaynhan,ngaytra;
    private int tiendv;
    private static int cnt=1;
    public KhachHang(String ten, String sophong, String ngaynhan, String ngaytra, int tiendv) throws ParseException {
        ma = String.format("KH%02d",cnt);
        this.ten = ten;
        chuanHoaTen();
        this.sophong = sophong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaynhan = sdf.format(sdf.parse(ngaynhan));
        this.ngaytra = sdf.format(sdf.parse(ngaytra));
        this.tiendv = tiendv;
        cnt++;
    }
    
    private void chuanHoaTen(){
        String[] s = ten.trim().toLowerCase().split("\\s++");
        String res = "";
        for(String x:s){
            res+=x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        ten = res;
    }
    
    
    private int sno(){  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(ngaynhan,formatter);
        LocalDate d2 = LocalDate.parse(ngaytra,formatter);
        return (int) ChronoUnit.DAYS.between(d1, d2)+1;
    } 
    
    private int giaTheoTang(){
        char c = sophong.charAt(0);
        if(c=='1') return 25;
        else if(c=='2') return 34;
        else if(c=='3') return 50;
        return 80;
    }
    
    private int tongGiaTien(){
        return sno()*giaTheoTang()+tiendv;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", ma,ten,sophong,sno(),tongGiaTien());
    }
    
    @Override
    public int compareTo(KhachHang o) {
        return Integer.compare(o.tongGiaTien(), tongGiaTien());
    }
    
    
    
}
