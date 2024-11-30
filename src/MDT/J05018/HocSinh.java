package MDT.J05018;

/**
 *
 * @author Hoàng Hướng
 */
public class HocSinh implements Comparable<HocSinh> {
    private String ma,ten;
    private String[] diem;
    private static int cnt = 1;
    public HocSinh(String ten, String s) {
        ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.diem = s.trim().split("\\s+");
    }
     private double diemTB(){
        double res = 0;
        for(String x:diem) res+=Double.parseDouble(x);
        res+=Double.parseDouble(diem[0]);
        res+=Double.parseDouble(diem[1]);
        return res/(diem.length+2);
    }
    private String xepLoai(){
        if(diemTB()>=9) return "XUAT SAC";
        if(diemTB()>=8) return "GIOI";
        if(diemTB()>=7) return "KHA";
        if(diemTB()>=5) return "TB";
        return "YEU";
    }
    @Override
    public int compareTo(HocSinh o){
        return Double.compare(o.diemTB(), diemTB());
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", ma,ten,(double)Math.round(diemTB()*10)/10,xepLoai());
    }
    
}
