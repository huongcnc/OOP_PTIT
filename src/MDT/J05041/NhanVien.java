package MDT.J05041;

/**
 *
 * @author Hoàng Hướng
 */
public class NhanVien implements Comparable<NhanVien> {
    private String ma,ten;
    private int luongngay,snc;
    private String chucvu;
    private static int cnt=1;
    public static int tongtienluong = 0;

    public NhanVien(String ten, int luongngay, int snc, String chucvu) {
        ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.luongngay = luongngay;
        this.snc = snc;
        this.chucvu = chucvu;
        tongtienluong+=thucLinh();
    }
    
    private int luongThang(){
        return luongngay*snc;
    }
    private int thuong(){
        if(snc>=25) return luongThang()/5;
        if(snc>=22) return luongThang()/10;
        return 0;
    }
    private int phuCapChucVu(){
        if(chucvu.equals("GD")) return 250000;
        if(chucvu.equals("PGD")) return 200000;
        if(chucvu.equals("TP")) return 180000;
        return 150000;    
    }
    private int thucLinh(){
        return luongThang()+thuong()+phuCapChucVu();
    }
    @Override
    public int compareTo(NhanVien o){
        return Integer.compare(o.thucLinh(),thucLinh() );
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", ma,ten,luongThang(),
                thuong(),phuCapChucVu(),thucLinh());
    }
    
    
    
    
}
