package introToProblemSolving.compairingObject;

public class Student implements Comparable<Student>{

    private int marks;
    private int rollNo;

    public Student(int marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student student) {

        // 0 => equal
        // -1 => student is bigger else smaller

        return this.marks - student.getMarks();
    }
}
