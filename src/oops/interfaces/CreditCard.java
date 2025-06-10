package oops.interfaces;

public class CreditCard implements  Payment{

    @Override
    public void pay(){
        System.out.println("Payment done using credit card..");
    }
}
