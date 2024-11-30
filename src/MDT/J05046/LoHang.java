package MDT.J05046;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hoàng Hướng
 */
public class LoHang {
    private String ma, ten;
    private int soluong,dongia;
    private static Map<String,Integer> cnt = new HashMap<>();    

    public LoHang(String ten, int soluong, int dongia) {
        String[] arr = ten.toUpperCase().split("\\s+");
        String s = "";
        s += arr[0].substring(0,1)+arr[1].substring(0,1);
        if(cnt.containsKey(s)) cnt.put(s, cnt.get(s)+1);
        else cnt.put(s,1);
        ma = String.format("%s%02d",s,cnt.get(s));
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    
    private int phanTramChietKhau(){
        if(soluong>10) return 5;
        if(soluong>=8) return 2;
        if(soluong>=5) return 1;
        return 0;
    } 
    
    private int tienChietKhau(){
        return dongia*soluong*phanTramChietKhau()/100;
    }
    
    private int thanhTien(){
        return dongia*soluong-tienChietKhau();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", ma,ten,tienChietKhau(),thanhTien());
    }
    
    
    
    
    
}
