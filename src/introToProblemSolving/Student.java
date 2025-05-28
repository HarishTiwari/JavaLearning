package introToProblemSolving;

public class Student {

    String name ;
    int roll_no ;
    float marks;
    public Student(String name , int roll_no , float marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public void printDetails(){
        System.out.println(name + " " + marks + " " + roll_no);
    }
}
