package java8;

import java.util.Scanner;

interface Phone{
    void call();

    default void message(){
        System.out.println("Common message..");
    }
}

class Iphone implements Phone{

    @Override
    public void call() {
        System.out.println("Iphone Phone is calling..");
    }
}

public class DefaultKeyword {

    public static void main(String[] args) {

        Phone phone = new Iphone();
        phone.call();
        phone.message();

    }


}


