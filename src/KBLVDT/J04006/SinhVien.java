package KBLVDT.J04006;


/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien {
    private String ten;
    private String ns;
    private String lop;
    private double gpa;
    
    public SinhVien(String ten,String lop,String ns,double gpa) {
        this.ten = ten;
        this.lop = lop;
        this.ns = ch(ns);
        this.gpa = gpa;
    }
    
    private String ch(String ns) {
        String s[] = ns.split("/");
        String res = "";
        for(int i=0;i<2;i++){
            if(s[i].length()==1) res += "0"+s[i]+"/";
            else res += s[i]+"/";
        }
        return res+s[2];
        
    }

    public String toString(){
        return String.format("B20DCCN001 %s %s %s %.2f",ten,lop,ns,gpa);
    }

}
