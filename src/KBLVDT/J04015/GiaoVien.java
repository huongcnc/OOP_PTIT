package KBLVDT.J04015;

/**
 *
 * @author Hoàng Hướng
 */
public class GiaoVien {
    private String mn;
    private String ten;
    private int tn;
    
    public GiaoVien(){
        
    }
    
    public GiaoVien(String mn,String ten,int tn){
        this.mn = mn;
        this.ten = ten;
        this.tn = tn;
    }
    
    public String getMn(){
        return mn;
    }
    
    public String getTen(){
        return ten;
    }
    
    public int getBl(){
        return 10*(mn.charAt(2)-'0')+mn.charAt(3)-'0';
    }
    
    public int getPc(){
        String s = mn.substring(0,2);
        if(s.equals("HT")) return 2000000;
        else if(s.equals("HP")) return 900000;
        return 500000;
    }
    
    
    
    public int getTn(){
        return getBl()*tn+getPc();
    }
}
