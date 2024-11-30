package MDT.J05029;

/**
 *
 * @author Hoàng Hướng
 */
public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma,ten;
    private int ssv;

    public DoanhNghiep(String ma, String ten, int ssv) {
        this.ma = ma;
        this.ten = ten;
        this.ssv = ssv;
    }
    
    public boolean check(int n,int m){
        return ssv>=n&&ssv<=m;
    }
    
    @Override
    public int compareTo(DoanhNghiep o){
        if(ssv == o.ssv) return ma.compareTo(o.ma);
        return Integer.compare(o.ssv, ssv);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ssv;
    }
    
}
