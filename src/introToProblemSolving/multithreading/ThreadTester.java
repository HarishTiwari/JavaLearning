package introToProblemSolving.multithreading;

public class ThreadTester {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Starts..");

//        Thread thread1 = new Thread1("Thread1");
       // thread1.setDaemon(true); // to make thread as Daemon thread
//        thread1.start();

//        Stack stack = new Stack(10);
//
//        new Thread(() -> {
//            for (int i=1; i<=10;i++)
//                System.out.println("Pushed.." + " " + stack.push(i));
//
//        },"Pusher").start();
//
//        new Thread(() -> {
//            for (int i=1; i<=10;i++)
//                System.out.println("Popped.." + " " + stack.pop());
//
//        },"Popper").start();

        ThreadSafe count = new ThreadSafe();

       Thread t1 = new Thread(() -> {
            for (int i=0 ; i < 1000 ; i++){
                count.increment();
            }
        },"count1");

       Thread t2 =  new Thread(() -> {
            for (int i=0 ; i < 1000 ; i++){
                count.increment();
            }
        },"count2");

       t1.start();
       t2.start();

       t1.join();
       t2.join();



        System.out.println(count.counter);

        System.out.println("Main ends..");

//        Thread thread2 = new Thread(new Thread2(), "Thread2");
//        thread2.start();

//        new Thread(new Thread2()).run();

//        Thread thread3 = new Thread(() -> {
//
//            System.out.println("Thread 3 starts using lambda expression...");
//
//        },"Thread3");
//
//        thread3.start();

    }

}
