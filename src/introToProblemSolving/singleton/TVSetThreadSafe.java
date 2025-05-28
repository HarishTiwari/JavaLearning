package introToProblemSolving.singleton;

public class TVSetThreadSafe {

    // Singleton design pattern
    // In this, only one instance can be created for this class

    private static volatile TVSetThreadSafe tvSet = null;
    private TVSetThreadSafe(){
        System.out.println("TV object is created..");
    }

    public  static TVSetThreadSafe getInstance(){

        if(tvSet==null){ // for optimisation
            synchronized(TVSetThreadSafe.class){ // t1 , t2
                if(tvSet==null) // for double check
                tvSet = new TVSetThreadSafe();
            }
        }
        return tvSet;
    }
}

// time0 -> t1, t2
// time1 -> t5,t6,t7