package designPatterns.singleton;

public class DoubleCheckedSingleton {

    public static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckedSingleton.class){
                if (instance==null){
                    return new DoubleCheckedSingleton();
                }
            }

        }

        return instance;


    }


}
