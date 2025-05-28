package introToProblemSolving.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Harish = new Human(26, "Harish");
        Human xyz = new Human(Harish);

        System.out.println(xyz);

        Human twin = (Human)Harish.clone();
        System.out.println(twin);
    }
}
