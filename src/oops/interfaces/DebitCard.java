package oops.interfaces;

public class DebitCard implements  Payment{
    @Override
    public void pay() {
        System.out.println("Payment done using Debit card..");
    }
}
