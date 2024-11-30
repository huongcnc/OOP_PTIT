package MDT.J05024;

/**
 *
 * @author Hoàng Hướng
 */
public class SinhVien {
    private String ma,ten,lop,email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    private String kyTuNganh(String s){
        if(s.equals("KE TOAN")) return "DCKT";
        if(s.equals("CONG NGHE THONG TIN")) return "DCCN";
        if(s.equals("AN TOAN THONG TIN")) return "DCAT";
        if(s.equals("VIEN THONG")) return "DCVT";
        return "DCDT";
    }
    public boolean checkNganh(String nganh){
        String s = kyTuNganh(nganh);
        if(ma.contains(s)){
            if(s.equals("DCCN")||s.equals("DCAT")){
                return lop.charAt(0)!='E';
            }
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", ma,ten,lop,email);
    }
    
}
