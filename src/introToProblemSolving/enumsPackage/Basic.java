package introToProblemSolving.enumsPackage;

public class Basic {

    enum Week{
        Monday, Tuesday, Wednesday,Thursday,Friday,Saturday,Sunday
        // these are enum constants
        // public ,static and final
        // type is week
    }

    public static void main(String[] args) {
        Week week;

        week = Week.Friday;

        System.out.println(week);
        System.out.println(week.ordinal()); // tells position of it inside enum
    }




}
