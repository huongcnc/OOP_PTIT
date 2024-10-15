package MDT.J05081;

/**
 *
 * @author Hoàng Hướng
 */
public class MatHang {
    private static int stt = 0;
    private String ma="MH";
    private String ten;
    private String dv;
    private int gm;
    private int gb;
    
    public MatHang(String ten,String dv,int gm,int gb){
        this.ten = ten;
        this.dv = dv;
        this.gm = gm;
        this.gb = gb;
        stt++;
        for(int i=0;i<3-Integer.toString(stt).length();i++){
            ma += '0';
        }
        ma += Integer.toString(stt);
    }
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getDv(){
        return dv;
    }
    
    public int getGm(){
        return gm;
    }
    
    public int getGb(){
        return gb;
    }
    
   public int getLoiNhuan(){
       return gb-gm;
   }
   
   public String toString(){
       return String.format("%s %s %s %d %d %d",ma,ten,dv,gm,gb,getLoiNhuan());
   }
}
