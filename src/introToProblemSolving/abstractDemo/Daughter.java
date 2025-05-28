package introToProblemSolving.abstractDemo;

public class Daughter extends Parent{

    Daughter(int age){
        super(age);
    }
    @Override
    public void career() {
        System.out.println("I want to become app developer");
    }
}
