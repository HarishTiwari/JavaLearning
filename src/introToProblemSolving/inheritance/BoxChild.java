package introToProblemSolving.inheritance;

public class BoxChild extends Box{

    double weight;

    public BoxChild(double height, double width, double length,double weight) {
        super(height, width, length);
        this.weight = weight;
    }

    BoxChild(){

    }
}
