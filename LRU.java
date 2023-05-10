import java.util.*;

public class LRU {

    private int capacity;
    private Map<Integer, Integer> cache;
    private Deque<Integer> queue;

    public LRU(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.queue = new LinkedList<>();
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            // Move the key to the end of the queue
            queue.remove(key);
            queue.offer(key);
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            // Update the value and move the key to the end of the queue
            cache.put(key, value);
            queue.remove(key);
            queue.offer(key);
        } else {
            if (cache.size() >= capacity) {
                // Remove the least recently used key
                int leastUsedKey = queue.poll();
                cache.remove(leastUsedKey);
            }
            // Add the new key to the end of the queue
            cache.put(key, value);
            queue.offer(key);
        }
    }
}
