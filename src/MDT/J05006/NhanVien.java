package MDT.J05006;

/**
 *
 * @author Hoàng Hướng
 */
public class NhanVien {
    private String ma,ten,gt,ns,dc,mst,nkhd;
    private static int cnt = 1;

    public NhanVien(String ten, String gt, String ns, String dc, String mst, String nkhd) {
        ma = String.format("%05d",cnt++);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", ma,ten,gt,ns,dc,mst,nkhd);
    }
    
}
