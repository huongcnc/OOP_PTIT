package MDT.J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hoàng Hướng
 */
public class NhanVien implements Comparable<NhanVien> {
    private String ma,ten,gt,dc,mst,nkhd;
    private Date ns;
    private static int cnt = 1;

    public NhanVien(String ten, String gt, String ns, String dc, String mst, String nkhd) throws ParseException {
        ma = String.format("%05d",cnt++);
        this.ten = ten;
        this.gt = gt;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ns = sdf.parse(ns);
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }
    
    @Override
    public int compareTo(NhanVien o){   
        return ns.compareTo(o.ns);
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %s %s %s", ma,ten,gt,sdf.format(ns),dc,mst,nkhd);
    }
    
}
