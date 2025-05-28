package introToProblemSolving.multithreading;

class SharedObj{
    private volatile boolean flag = true;

    public void setFlag()  {
        flag = true;

        System.out.println("Flag is set true..");
    }

    public void printIfFlagTrue() {
        while(!flag){
            // do nothing
        }
        System.out.println("Flag is true..");
    }
}
public class VolatileExample {
    public static void main(String[] args) {

        SharedObj obj = new SharedObj();

        Thread writerThread = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            obj.setFlag();
        }
        );

        Thread readerThread = new Thread(()->{
            obj.printIfFlagTrue();
        });

        writerThread.start();
        readerThread.start();
    }
}
