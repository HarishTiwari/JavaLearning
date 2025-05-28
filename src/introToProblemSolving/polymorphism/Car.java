package introToProblemSolving.polymorphism;

public class Car {

    String color;
    int maxSpeed;
    int avgSpeed;

    public Car(String color, int maxSpeed, int avgSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.avgSpeed = avgSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void carMethod(){
        System.out.println("I am a car...");
    }
}
