package introToProblemSolving.exceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
//            int c = divideExpression(a,b);
//            System.out.println(c);

            String name = "Harish";
            if (name.equals("Harish")) {
                throw new CustomException("Custom Exception");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will execute no matter what");
        }
    }

    private static int divideExpression(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Do not divide by zero");
        }

        return a / b;
    }
}
