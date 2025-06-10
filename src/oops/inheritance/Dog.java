package oops.inheritance;

public class Dog extends Animal{

    Dog(){
        super();
        System.out.println("Dog constructor is called..");
    }

    public void bark(){
        System.out.println("Bark...");
    }
}
