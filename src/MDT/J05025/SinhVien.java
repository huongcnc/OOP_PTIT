package MDT.J05025;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien implements Comparable<SinhVien> {
    private String ma, hvt,bm;
    private static int cnt=1;

    public SinhVien(String hvt, String bm) {
        ma = String.format("GV%02d", cnt++);
        this.hvt = hvt;
        this.bm ="";
        for(String x:bm.toUpperCase().split("\\s+")){
            this.bm+=x.charAt(0);
        }
    }
    
    private String getTen(){
        String s[] = hvt.split("\\s+");
        return s[s.length-1];
    }
    
    @Override
    public int compareTo(SinhVien o){
        if(getTen().compareTo(o.getTen())!=0)return getTen().compareTo(o.getTen());
        return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + " " + hvt + " " +bm;
    }
    
    
}
