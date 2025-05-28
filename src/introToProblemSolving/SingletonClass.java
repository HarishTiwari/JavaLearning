package introToProblemSolving;

public class SingletonClass {

    // THis class only allow to create single object
    // If we try to create multiple object  it all points to same obj.
    private SingletonClass(){

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        // create 1 obj if it is not present
        if(instance == null){
            instance = new SingletonClass();
        }

        return instance;
    }
}
