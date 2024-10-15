package File.J07034;

/**
 *
 * @author Hoàng Hướng
 */
public class MonHoc {
    private String ma,ten;
    private int stc;
    
    public MonHoc(String ma, String ten, int stc) {
        this.ma = ma;
        this.ten = ten;
        this.stc = stc;
    }

    public String getTen() {
        return ten;
    }
    

    

    public String toString() {
        return String.format("%s %s %d",ma,ten,stc);
    }
    
}
