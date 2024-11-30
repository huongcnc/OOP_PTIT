package TH2.B9;

/**
 *
 * @author Hoàng Hướng
 */
import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DANGKY.in"));
        Scanner sc3 = new Scanner(new File("TRUYVAN.in"));
        
        Map<String,SinhVien> lsSV = new HashMap<>();
        ArrayList<DangKy> lsDK = new ArrayList<>();
        
        int n = Integer.parseInt(sc1.nextLine());
        while(n-->0){
            SinhVien s = new SinhVien(sc1.nextLine(),sc1.nextLine(),
                    sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
            lsSV.put(s.getMa(), s);
        }
        
        while(sc2.hasNextLine()){
            lsDK.add(new DangKy(sc2.nextLine()));
        }
        
        n = sc3.nextInt();
        while(n-->0){
            String gt = sc3.next(),size = sc3.next();
            ArrayList<SinhVien> ls = new ArrayList<>();
            for(DangKy x:lsDK){
                if(size.equals(x.getSize()) && gt.equals(lsSV.get(x.getMa()).getGt())){
                    ls.add(lsSV.get(x.getMa()));
                }
            }
            Collections.sort(ls);
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", 
                    gt.toUpperCase(),size);
            for(SinhVien x:ls) {
                System.out.println(x);
            }
            
        }
        
    }
    
}
