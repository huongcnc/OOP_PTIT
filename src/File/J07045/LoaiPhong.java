package File.J07045;

/**
 *
 * @author Hoàng Hướng
 */
public class LoaiPhong implements Comparable<LoaiPhong> {
    private String kh,ten;
    private int gn;
    private double ppv;

    public LoaiPhong(String in)  {
        String s[] = in.trim().split("\\s+");
        kh = s[0];
        ten = s[1];
        gn = Integer.parseInt(s[2]);
        ppv = Double.parseDouble(s[3]);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f", kh,ten,gn,ppv);
    }
    
    @Override
    public int compareTo(LoaiPhong other){
        return ten.compareTo(other.ten);
    }
    
    
}
