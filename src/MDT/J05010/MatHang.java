package MDT.J05010;

/**
 *
 * @author Hoàng Hướng
 */
public class MatHang implements Comparable<MatHang> {
    private String ma,ten,nhom;
    private double giamua,giaban;
    private static int cnt=1;

    public MatHang(String ten, String nhom, double giamua, double giaban) {
        ma = Integer.toString(cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.giaban = giaban;
        this.giamua = giamua;
    }
    private double loiNhuan(){
        return giaban-giamua;
    }
    
    @Override
    public int compareTo(MatHang o){
        return Double.compare(o.loiNhuan(), loiNhuan());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", ma,ten,nhom,loiNhuan());
    }
    
    
}
