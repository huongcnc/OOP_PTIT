package TH3.B4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 *
 * @author Hoàng Hướng
 */
public class BaiTap implements Comparable<BaiTap> {
    private String ma,ten,tendetai;
    private Map<String,String> bc;
    public static int cnt1 = 0, cnt2 = 0;
    public BaiTap(String ma, String ten, String tendetai,Map<String,String> bc) {
        this.ma = ma;
        this.ten = ten;
        this.tendetai = tendetai;
        this.bc = bc;
        if(ca().equals("SANG")) cnt1++;
        else cnt2++;
    }
    
    private LocalTime getTime(){
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(bc.get(ma));
    }
    private String ca(){
        if(getTime().getHour()<12) return "SANG";
        return "CHIEU";
    }
    private LocalTime getTime1(){
        if(ca().equals("SANG")) return getTime();
        return LocalTime.of(getTime().getHour()-12, getTime().getMinute());
    }
    public boolean check(String s){
        return s.equals(ca());
    }
    @Override
    public int compareTo(BaiTap o){
        return getTime1().compareTo(o.getTime1());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %02d:%02d", ma,ten,tendetai,
                getTime1().getHour(),getTime1().getMinute());
    }
    
    
}
