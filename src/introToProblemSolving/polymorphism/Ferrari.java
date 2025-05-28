package introToProblemSolving.polymorphism;

public class Ferrari extends Car{

    Ferrari(String color , int maxSpeed , int avgSpeed){
        super(color,maxSpeed,avgSpeed);

    }

    @Override
    public void carMethod() {
        System.out.println("I am a ferrari");
    }
}
