package KBLVDT.J07058;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Hoàng Hướng
 */
public class DsMonHoc {
   private ArrayList<MonHoc> ds;
   
   public DsMonHoc(){
       
   }
   
   public DsMonHoc(ArrayList<MonHoc> ds){
       this.ds = ds;
   }
   
   public ArrayList<MonHoc> getDs(){
       return ds;
   }
   
   public void sapXep(){
       Collections.sort(ds, new Comparator<MonHoc>(){
           public int compare(MonHoc m1,MonHoc m2){
               return m1.getMa().compareTo(m2.getMa());
           }
       });
   }
}
