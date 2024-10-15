package File.J07010;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien {
    private String ten,lop,ns,ma="B20DCCN";
    private double gpa;
    private static int stt=0;
    
    public SinhVien(String ten,String lop,String ns,double gpa){
        stt++;
        ma+=String.format("%03d", stt);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        this.ns = chuanhoa(ns);
    }
    
    private String chuanhoa(String ns) {
        String s[] = ns.split("/");
        String res = "";
        for(int i=0;i<2;i++){
            if(s[i].length()==1) res+="0";
            res+=s[i]+"/";
        }
        return res+s[2];
    }
    public String toString(){
        return String.format("%s %s %s %s %.2f",ma,ten,lop,ns,gpa);
    }
}
