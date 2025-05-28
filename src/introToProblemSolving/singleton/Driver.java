package introToProblemSolving.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

    public static void main(String[] args) {
//        TVSet member1 = TVSet.getInstance();
//        TVSet member2 = TVSet.getInstance();
//
//        System.out.println(member1);
//        System.out.println(member2);

        ExecutorService ex = Executors.newFixedThreadPool(2);

//        ex.execute(() -> TVSet.getInstance());
//        ex.execute(() -> TVSet.getInstance());

        ex.execute(() -> TVSetThreadSafe.getInstance());
        ex.execute(() -> TVSetThreadSafe.getInstance());
    }

}
