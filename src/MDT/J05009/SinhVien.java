package MDT.J05009;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien {
    private String ma,ten,ns;
    private double d1,d2,d3;
    private static int cnt=1;
    private static double max=0;

    public SinhVien(String ten, String ns, double d1, double d2, double d3) {
        ma = Integer.toString(cnt++);
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        max = Math.max(max, tongDiem());
    }
    private double tongDiem(){
        return d1 + d2 + d3;
    }
    public boolean check(){
        return tongDiem()==max;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f",ma,ten,ns,tongDiem());
    }
    
    
}
