package introToProblemSolving.interfacePackage;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");
    }
}
