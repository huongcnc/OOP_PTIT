package File.J07048;

/**
 *
 * @author Hoàng Hướng
 */
public class SanPham implements Comparable<SanPham>{
    private String ma,ten;
    private int gia,thoihan;

    public SanPham(String ma, String ten, int gia, int thoihan) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.thoihan = thoihan;
    }

    

    @Override
    public String toString() {
        return String.format("%s %s %d %d", ma,ten,gia,thoihan);
    }
    
    @Override
    public int compareTo(SanPham other){
        if(gia==other.gia) return ma.compareTo(other.ma);
        return Integer.compare(other.gia, gia);
    }
}
