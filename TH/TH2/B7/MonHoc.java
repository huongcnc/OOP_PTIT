package TH2.B7;

/**
 *
 * @author Hoàng Hướng
 */
public class MonHoc implements Comparable<MonHoc> {
    private String maMH,tenMH,ht;

    public MonHoc(String maMH, String tenMH, String ht) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.ht = ht;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + ht;
    }
    
    @Override
    public int compareTo(MonHoc o){
        return maMH.compareTo(o.maMH);
    }
}
