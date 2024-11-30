package BT.Test;

/**
 *
 * @author Hoàng Hướng
 */
public class Student extends Person {
    private String code;

    public Student(String code, String name, String add) {
        super(name, add);
        this.code = code;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code +add+name+'}';
    }

    
    
    
}
