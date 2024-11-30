package MDT.J05005;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop, ns;
    private double gpa;
    private static int cnt = 1;

    public SinhVien(String ten, String lop, String ns, double gpa) throws ParseException {
        ma = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        chuanHoa();
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ns = sdf.format(sdf.parse(ns));
        this.gpa = gpa;
    }
    
    private void chuanHoa(){
        String[] s = ten.trim().toLowerCase().split("\\s+");
        String res = "";
        for(int i=0;i<s.length;i++) {
            res += s[i].substring(0,1).toUpperCase()+s[i].substring(1)+" ";
        }
        ten = res;
    }
    
    @Override
    public int compareTo(SinhVien o){
        return Double.compare(o.gpa, gpa);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f",ma,ten,lop,ns,gpa);
    }
    
    
}
