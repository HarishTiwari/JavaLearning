package introToProblemSolving;

public class StaticIntialise {

    static int a = 4;
    static int b;

    static{
        System.out.println("I am in static block");
        b = a *4;
    }

    public static void main(String[] args) {
        StaticIntialise sta = new StaticIntialise();
        System.out.println(StaticIntialise.a + " " + StaticIntialise.b);
    }
}
