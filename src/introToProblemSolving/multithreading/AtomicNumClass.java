package introToProblemSolving.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicNumClass {

    private AtomicInteger count = new AtomicInteger(0);
    // AtomicInteger provides the thread safe way to do the operations on integers.

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}

class DemoAtomic{

public static void main(String[] args) throws InterruptedException {

    AtomicNumClass atm = new AtomicNumClass();

    Thread thread1 = new Thread(() -> {
       for (int i = 0 ; i < 1000 ; i++){
           atm.increment();
       }
    });

    Thread thread2 = new Thread(() -> {
        for (int i = 0 ; i < 1000 ; i++){
            atm.increment();
        }
    });

    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();

    System.out.println(atm.getCount());


}
        }
