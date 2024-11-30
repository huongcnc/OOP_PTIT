package MDT.J05045;

/**
 *
 * @author Hoàng Hướng
 */
public class NhanVien implements Comparable<NhanVien> {
    private String ma,ten,chucvu;
    private int luong,nc;
    private static int cnt =1;

    public NhanVien(String ten, String chucvu, int luong,int nc) {
        ma = String.format("NV%02d",cnt++);
        this.ten = ten;
        this.chucvu = chucvu;
        this.luong = luong;
        this.nc = nc;
    }
    
    private int phuCapChucVu(){
        if(chucvu.equals("GD")) return 500;
        if(chucvu.equals("PGD")) return 400;
        if(chucvu.equals("TP")) return 300;
        if(chucvu.equals("KT")) return 250;
        return 100;
    }
    
    private int luongChinh(){
        return luong*nc;
    }
    
    private int tamUng(){
        double res = (double) (phuCapChucVu()+luongChinh())*2/3;
        if(res < 25000) return (int)Math.round(res/1000)*1000;
        return 25000;
    }
    private int conLai(){
        return luongChinh()+phuCapChucVu()-tamUng();
    }
    private int thuNhap(){
        return luongChinh()+phuCapChucVu();
    }
    
    @Override
    public int compareTo(NhanVien o){
        if(thuNhap()!=o.thuNhap())return Integer.compare(o.thuNhap(), thuNhap());
        return ma.compareTo(o.ma);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCapChucVu() + " " + luongChinh()
               + " " + tamUng() + " " + conLai();
    }
    
}
