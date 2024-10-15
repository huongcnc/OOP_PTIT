package KBLVDT.J07058;

/**
 *
 * @author Hoàng Hướng
 */
public class MonHoc {
    private String ma;
    private String ten;
    private String ht;
    
    public MonHoc(){
        
    }
    
    public MonHoc(String ma,String ten,String ht){
        this.ten = ten;
        this.ma = ma;
        this.ht = ht;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getHt(){
        return ht;
    }
}
