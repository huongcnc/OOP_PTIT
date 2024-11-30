package MDT.J05011;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Hoàng Hướng
 */
public class NguoiChoi implements Comparable<NguoiChoi> {
    private String ma,ten;
    private LocalTime giovao,giora;

    public NguoiChoi(String ma, String ten, String giovao, String giora) {
        this.ma = ma;
        this.ten = ten;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        this.giovao = LocalTime.parse(giovao, fmt);
        this.giora = LocalTime.parse(giora, fmt);
    }
    
    private LocalTime tGianChoi(){
        int h =(int) ChronoUnit.HOURS.between(giovao, giora)%24;
        int m =(int) ChronoUnit.MINUTES.between(giovao, giora)%60;
        return LocalTime.of(h, m);
    }
    @Override
    public int compareTo(NguoiChoi o){
        return o.tGianChoi().compareTo(tGianChoi());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d gio %d phut", ma,ten,tGianChoi().getHour(),tGianChoi().getMinute());
    }
    
    
    
}

