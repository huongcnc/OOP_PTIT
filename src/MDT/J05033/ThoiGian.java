package MDT.J05033;

/**
 *
 * @author Hoàng Hướng
 */
public class ThoiGian  {
    private int gio;
    private int phut;
    private int giay;
    
    public ThoiGian(int gio,int phut,int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public int getTongGiay(){
        return gio*3600+phut*60+giay;
    }
    
    
    public String toString(){
        return String.format("%d %d %d",gio,phut,giay);
    }
}
