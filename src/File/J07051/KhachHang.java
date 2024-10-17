package File.J07051;

/**
 *
 * @author Hoàng Hướng
 */
import java.time.*;
public class KhachHang implements Comparable<KhachHang> {
    private String ma,ten,sophong,ngaynhan,ngaytra;
    private int tiendv;
    private static int cnt=1;

    public KhachHang(String ten, String sophong, String ngaynhan, String ngaytra, int tiendv) {
        ma = String.format("KH%02d",cnt);
        this.ten = chuanHoaTen();
        this.sophong = sophong;
        this.ngaynhan = ngaynhan;
        this.ngaytra = ngaytra;
        this.tiendv = tiendv;
        cnt++;
    }
    
    private String chuanHoaTen(){
        String[] s = ten.trim().toLowerCase().split("\\s++");
        String res = "";
        for(String x:s){
            res+=x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        return res;
    }
    
    private String chuanHoaNgay(String n){
        String[] s = n.trim().split("\\s++");
    }
    
    private int sno(){  
        LocalDate d1 = LocalDate.parse(ngaynhan);
        LocalDate d2 = LocalDate.parse(ngaytra);
        return Period.between(d1, d2).getDays();
    } 
    
    private int giaTheoTang(){
        char c = ma.charAt(0);
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
