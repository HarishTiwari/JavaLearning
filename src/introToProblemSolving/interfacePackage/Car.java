package introToProblemSolving.interfacePackage;

public class Car implements Brake,Engine{
    @Override
    public void brake() {
        System.out.println("Car stops");
    }

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
