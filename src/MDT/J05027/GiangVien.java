package MDT.J05027;

/**
 *
 * @author Hoàng Hướng
 */
public class GiangVien {
    private String ma, hvt,bm;
    private static int cnt=1;

    public GiangVien(String hvt, String bm) {
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
    public boolean check(String s){
        String a = hvt.toLowerCase();
        s = s.toLowerCase();
        return a.contains(s);
    }
    @Override
    public String toString() {
        return ma + " " + " " + hvt + " " +bm;
    }
    
    
}
