package TH1.B12;

/**
 *
 * @author Hoàng Hướng
 */
public class Student {
    private String id,name,sdt, email;

    public Student(String id, String name, String sdt, String email) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s", id,name,sdt,email);
    }
}
