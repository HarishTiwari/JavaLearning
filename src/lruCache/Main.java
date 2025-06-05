package lruCache;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        LRUCache lru = new LRUCache(2);
        lru.put(1,1);
        lru.put(2,2);
        System.out.println(lru.get(1));
    }
}
