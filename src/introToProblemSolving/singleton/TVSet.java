package introToProblemSolving.singleton;

public class TVSet {

    // Singleton design pattern
    // In this, only one instance can be created for this class

    private static TVSet tvSet = null;
    private TVSet(){
        System.out.println("TV object is created..");
    }

    public static TVSet getInstance(){
        if(tvSet==null)
            tvSet = new TVSet();

        return tvSet;
    }
}
