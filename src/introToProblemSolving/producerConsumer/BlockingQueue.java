package introToProblemSolving.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private Queue<Integer> q;

    private int capacity;

    public BlockingQueue(int cap) {
        q = new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int item) {
        synchronized (q) {
            while (q.size() == capacity) { // thread 1 , thread 2
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            q.add(item);
            q.notifyAll();

            return true;

        }
    }

    public int remove() {
        synchronized (q) {
            while (q.size() == 0) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int element = q.poll();
            return element;
        }
    }
}
