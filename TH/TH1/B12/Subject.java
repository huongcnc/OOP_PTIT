package TH1.B12;

/**
 *
 * @author Hoàng Hướng
 */
public class Subject {
    private static int cnt = 1;
    private String id,lctName,sbjName;

    public Subject(String lctName, String sbjName) {
        id = String.format("DT%03d",cnt++);
        this.lctName = lctName;
        this.sbjName = sbjName;
    }

    public String getSbjName() {
        return sbjName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s %s",lctName,sbjName);
    }
    
    
}
