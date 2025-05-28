package introToProblemSolving.multithreading;

public class ThreadSafe {

    int counter;

    public synchronized void increment(){
        counter++;
    }

}
