package java8;

interface Car {
    void brandName();
}

interface Add {
    int sumOfTwoNum(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("Lambda Demo working...");

        // implementing lambda expression

        Car car = () -> System.out.println("Ferrari..");

        car.brandName();

        Add add = (a,b) -> a+b;

        System.out.println(add.sumOfTwoNum(2,3));
    }
}
