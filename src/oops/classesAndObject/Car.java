package oops.classesAndObject;

public class Car {

    private String color;
    private String model;
    private int year;
    private String musicSystem ;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String color, String model, int year, String musicSystem) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.musicSystem = musicSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }
}
