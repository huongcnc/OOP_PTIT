package MDT.J05042;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private int cr,sm;

    public SinhVien(String ten, String s) {
        this.ten = ten;
        String[] arr = s.split("\\s+");
        cr = Integer.parseInt(arr[0]);
        sm = Integer.parseInt(arr[1]);
    }
    @Override
    public int compareTo(SinhVien o){
        if(cr!=o.cr) return Integer.compare(o.cr, cr);
        if(sm!=o.sm) return Integer.compare(sm, o.sm);
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ten + " " + cr + " " + sm;
    }
    
    
    
    
}
