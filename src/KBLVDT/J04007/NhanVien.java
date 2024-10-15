package KBLVDT.J04007;

/**
 *
 * @author Hoàng Hướng
 */
public class NhanVien {
    private String mnv = "00001";
    private String ten;
    private String gt;
    private String ns;
    private String dc;
    private String mst;
    private String nkhd;
    
    public NhanVien(){
        
    }
    
    public String getMnv(){
        return mnv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getTen(){
        return ten;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }
    
    public String getGt(){
        return gt;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }
    
    public String getNs(){
        return ns;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    
    public String getDc(){
        return dc;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }
    
    public String getMst(){
        return mst;
    }

    public void setNkhd(String nkhd) {
        this.nkhd = nkhd;
    }
    
    public String getNkhd(){
        return nkhd;
    }
    
    
}
