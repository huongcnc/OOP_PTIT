package MDT.J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Hoàng Hướng
 */
public class DSMatHang {
    private ArrayList<MatHang> dsmh;
    
    public DSMatHang(ArrayList<MatHang> dsmh){
        this.dsmh = dsmh;
    }
    
    public ArrayList<MatHang> getDsmh(){
        return dsmh;
    }
    
    public void SapXep(){
        Collections.sort(dsmh, new Comparator<MatHang>(){
            public int compare(MatHang m1,MatHang m2){
                return Integer.compare(m2.getLoiNhuan(), m1.getLoiNhuan());
            }
        });
    }
}
