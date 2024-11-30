package TH2.B6;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private int ac,sm;

    public SinhVien(String name, String s) {
        this.name = name;
        String[] a = s.trim().split("\\s+");
        ac = Integer.parseInt(a[0]);
        sm = Integer.parseInt(a[1]);
    }

    @Override
    public String toString() {
        return name + " " + ac + " " + sm;
    }
    
    @Override
    public int compareTo(SinhVien o){
        if(ac != o.ac) return Integer.compare(o.ac, ac);
        if(sm != o.sm) return Integer.compare(sm,o.sm);
        return name.compareTo(o.name);
    }
}
