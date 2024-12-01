package TH3.B5;

import java.util.ArrayList;

/**
 *
 * @author Hoàng Hướng
 */
public class GiangVien {
    private String ma,ten;
    private ArrayList<GioChuan> gc;

    public GiangVien(String s,ArrayList<GioChuan> gc) {
        String[] arr = s.split("\\s+");
        ma = arr[0];
        ten = "";
        for(int i=1;i<arr.length;i++) ten+=arr[i]+" ";
        this.gc=gc;
    }
    
    private double tongGC(){
        double sum=0;
        for(GioChuan x:gc){
            if(ma.equals(x.getMaGV())) sum+=x.getGiochuan();
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", ten,tongGC());
    }
    
    
    
}
