package introToProblemSolving.inheritance;

public class BoxGrandChild extends BoxChild{

    double price;
    public BoxGrandChild(double height, double width, double length, double weight, double price) {
        super(height, width, length, weight);
        this.price = price;
    }
}
