package TH1.B12;

/**
 *
 * @author Hoàng Hướng
 */
public class Assignment implements Comparable<Assignment> {
    private String stdId,sbjId;
    private Student std;
    private Subject sbj;

    public Assignment(String stdId, String sbjId) {
        this.stdId = stdId;
        this.sbjId = sbjId;
    }
    @Override
    public int compareTo(Assignment other){
        return sbj.getSbjName().compareTo(other.sbj.getSbjName());
    }

    public Student getStd() {
        return std;
    }

    public void setStd(Student std) {
        this.std = std;
    }

    public void setSbj(Subject sbj) {
        this.sbj = sbj;
    }
    
    @Override
    public String toString() {
        return std.toString()+" "+sbj.toString();
    }
    
}
