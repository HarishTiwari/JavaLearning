package emp;

public class Employee {

    // name, age , dept

    private String name;
    private String dept;
    private int age;

    public Employee(String name,String dept,int age){
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getDept(){
        return dept;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void  setDept(String dept){
        this.dept = dept;
    }

}
