package introToProblemSolving.abstractDemo;

public abstract class Parent {

    int age;

     Parent(int age){
        this.age = age;
    }

    static void  hello(){
        System.out.println("This is static method hello");
    }

    void normalMethod(){
        System.out.println("This is normal instance method");
    }

    public abstract void career();
}

