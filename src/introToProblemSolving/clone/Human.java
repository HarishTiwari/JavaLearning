package introToProblemSolving.clone;

public class Human implements Cloneable {

    int age;
    String name;

    public Human(Human o) {

        this.age = o.age;
        this.name = o.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        // this is shallow copy
        // primitive will copy as it is
        // but for object it will point to same object
        // orignal and shallow will have same reference to that object
        return super.clone();
    }
}
