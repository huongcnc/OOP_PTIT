package MDT.J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien {
    private String ma,ten, lop;
    private Date ns;
    private double gpa;
    private static int cnt = 1;

    public SinhVien(String ten, String lop, String ns, double gpa) throws ParseException {
        ma = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.ns = df.parse(ns);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %.2f", ma,ten,lop,df.format(ns),gpa);
    }
    
}
