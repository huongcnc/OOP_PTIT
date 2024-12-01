package TH3.B2;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Hoàng Hướng
 */
public class CongNhan implements Comparable<CongNhan> {
    private String ma, ten;
    private LocalTime giovao,giora;

    public CongNhan(String ma, String ten, String giovao, String giora) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
        this.giovao = LocalTime.parse(giovao, df);
        this.giora = LocalTime.parse(giora,df);
    }
    
    private LocalTime thoiGianLamViec(){
        int m = (int)ChronoUnit.MINUTES.between(giovao, giora)-60;
        if(m<0) return LocalTime.of(0,0);
        return LocalTime.of(m/60, m%60);
    }
    
    private String check(){
        if(thoiGianLamViec().getHour()>=8) return "DU";
        return "THIEU";
    }
    @Override
    public int compareTo(CongNhan o){
        if(thoiGianLamViec().equals(o.thoiGianLamViec())) return ma.compareTo(o.ma);
        return o.thoiGianLamViec().compareTo(thoiGianLamViec());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d gio %d phut %s", ma,ten,
                thoiGianLamViec().getHour(),thoiGianLamViec().getMinute(),check());
    }
    
    
    
}
