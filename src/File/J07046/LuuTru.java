package File.J07046;

/**
 *
 * @author Hoàng Hướng
 */
import java.time.*;
import java.time.format.DateTimeFormatter;

public class LuuTru implements Comparable<LuuTru> {
    private String ma,ten,mp,nden,ndi;
    private static int cnt=0;

    public LuuTru(String ten, String mp, String nden, String ndi) {
        cnt++;
        ma = String.format("KH%02d", cnt);
        this.ten = ten;
        this.mp = mp;
        this.nden = nden;
        this.ndi = ndi;
    }
    
    private int snlt(){
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(nden,fm);
        LocalDate d2 = LocalDate.parse(ndi,fm);
        Period p = Period.between(d1, d2);
        return p.getDays();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d",ma,ten,mp,snlt());
    }
    
    @Override
    public int compareTo(LuuTru other){
        return Integer.compare(other.snlt(),snlt() );
    }
    
    
    
    
}
