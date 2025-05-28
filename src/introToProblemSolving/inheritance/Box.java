package introToProblemSolving.inheritance;

public class Box {

    double length;
    double width;
    double height;

    public Box(){

    }

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(double side){
        this.height = side;
        this.width = side;
        this.length = side;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
