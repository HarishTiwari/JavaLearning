package introToProblemSolving.abstractDemo;

public class Son extends Parent{

    Son(int age){
        super(age);
    }
    @Override
    public void career() {
        System.out.println("I want to become web developer");
    }
}
