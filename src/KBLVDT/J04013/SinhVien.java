package KBLVDT.J04013;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien {
    private String ma, ten;
    private double toan,ly,hoa;

    public SinhVien(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    private double diemUuTien(){
        char c = ma.charAt(2);
        if(c=='1') return 0.5;
        if(c=='2') return 1.0;
        return 2.5;
    }
    
    private double tongDiem(){
        return toan*2+ly+hoa;
    }
    
    private String trangThai(){
        if(tongDiem()+diemUuTien()>=24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    
    private String chuanHoa(double n){
        int a = (int) n;
        if((double) a != n) return String.format("%.1f", n);
        return Integer.toString(a);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + chuanHoa(diemUuTien())
                + " " + chuanHoa(tongDiem()) + " " + trangThai();
    }
    
    
    
    
    
}
