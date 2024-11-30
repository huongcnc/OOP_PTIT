package BT.Test;

/**
 *
 * @author Hoàng Hướng
 */
public class Person {
    protected String name, add;

    public Person(String name, String add) {
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", add=" + add + '}';
    }
    
}
