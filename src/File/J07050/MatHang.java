package File.J07050;

/**
 *
 * @author Hoàng Hướng
 */
public class MatHang implements Comparable<MatHang> {
    private String ma,ten,nhom;
    private double gmua,gban;
    private static int cnt=1;

    public MatHang(String ten, String nhom, double gmua, double gban) {
        ma = String.format("MH%02d", cnt);
        this.ten = ten;
        this.nhom = nhom;
        this.gmua = gmua;
        this.gban = gban;
        cnt++;
    }
    
    private double loiNhuan(){
        return gban-gmua;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %.2f",ma,ten,nhom,loiNhuan());
    }
    
    @Override
    public int compareTo(MatHang other){
        return Double.compare(other.loiNhuan(), loiNhuan());
    }
    
    
    
    
    
    
}
