package KBLVDT.J04012;

/**
 *
 * @author Hoàng Hướng
 */
public class NhanVien {
    private String ma,ten;
    private int luong,snc;
    private String chucvu;
    private static int cnt = 1;

    public NhanVien(String ten, int luong, int snc, String chucvu) {
        ma = String.format("NV%02d",cnt++);
        this.ten = ten;
        this.luong = luong;
        this.snc = snc;
        this.chucvu = chucvu;
    }
    
    private int luongthang(){
        return luong*snc;
    }
    
    private int luongthuong(){
        if(snc>=25) return luongthang()/5;
        if(snc>=22) return luongthang()/10;
        return 0;
    }
    private int phucap(){
        if(chucvu.equals("GD")) return 250000;
        if(chucvu.equals("PGD")) return 200000;
        if(chucvu.equals("TP")) return 180000;
        return 150000;
    }
    private int thunhap(){
        return luongthang()+luongthuong()+phucap();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d",ma,ten,luongthang(),luongthuong(),
                            phucap(),thunhap());
    }
    
    
    
}
