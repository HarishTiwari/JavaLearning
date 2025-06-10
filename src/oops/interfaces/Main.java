package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        Payment payment1 = new DebitCard();

        payment.pay();
        payment1.pay();
    }
}
