package introToProblemSolving.multithreading;

public class Stack {
    private final int[] array;
    private int stackTop;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }

    // synchronized keyword needs lock which should be an object
    // it can not be primitive
    // if synchronized keyword is used
    // it means
    // synchronized(this){
    // code..
    //  }
    // it passes the current class object as lock.
    // for static method internally it gives Stack.class
    // synchronized(Stack.class)
    public synchronized boolean push(int element) {
        if (isFull()) return false;
        ++stackTop;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        array[stackTop] = element;
        return true;
    }

    public synchronized int pop() {
        if (isEmpty()) return Integer.MIN_VALUE;

        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        stackTop--;
        return obj;
    }

    private boolean isEmpty() {

        return stackTop < 0;
    }

    private boolean isFull() {
        return stackTop == array.length - 1;
    }
}
