package MDT.J05026;

/**
 *
 * @author Hoàng Hướng
 */
public class GiangVien {
    private String ma,ten,bmon;
    private static int cnt = 1;
    public GiangVien(String ten, String bmon) {
        ma = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.bmon = bmon;
    }
    
    public static String kyTu(String s){
        String[] arr = s.trim().toUpperCase().split("\\s+");
        String res = "";
        for(String x:arr) res+=x.substring(0,1);
        return res;
    }
    
    public boolean checkBM(String s){
        return kyTu(bmon).equals(kyTu(s));
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + kyTu(bmon);
    }
    
    
}

