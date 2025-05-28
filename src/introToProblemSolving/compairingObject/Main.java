package introToProblemSolving.compairingObject;

public class Main {

    public static void main(String[] args) {
        Student Harish = new Student(99, 1);
        Student Sid = new Student(98, 2);

        int comp = Harish.compareTo(Sid);

        System.out.println(comp);

        if (comp > 0) {
            System.out.println("Harish has more marks");
        } else if (comp < 0) {
            System.out.println("Sid Has more marks");
        } else {
            System.out.println("Both are equal");
        }
    }
}
