package introToProblemSolving.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Son.hello();
        son.normalMethod();

        Daughter daughter = new Daughter(25);
        daughter.career();

    }
}
