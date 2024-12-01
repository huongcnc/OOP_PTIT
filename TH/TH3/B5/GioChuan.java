package TH3.B5;

/**
 *
 * @author Hoàng Hướng
 */
public class GioChuan {
    private String maGV,maMH;
    private double giochuan;

    public GioChuan(String s) {
        String[] arr = s.split("\\s+");
        maGV = arr[0];
        maMH = arr[1];
        giochuan = Double.parseDouble(arr[2]);
    }

    public String getMaGV() {
        return maGV;
    }

    public double getGiochuan() {
        return giochuan;
    }
    
    
}
