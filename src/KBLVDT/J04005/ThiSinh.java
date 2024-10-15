package KBLVDT.J04005;

/**
 *
 * @author Hoàng Hướng
 */
public class ThiSinh {
    private String ten;
    private String ns;
    private double d1,d2,d3;

    public ThiSinh(String ten, String ns, double d1, double d2, double d3) {
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    
   
    
    public String toString(){
        return String.format("%s %s %.1f",ten,ns,d1+d2+d3);
    }
    
}
