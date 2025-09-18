package algomaster_lld.lrucache;

public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        //put(1,A)
        lruCache.put(1, "A");
        //put(2,B)
        lruCache.put(2,"B");
        //put(3,C)
        lruCache.put(3,"C");
        //get(1)
        lruCache.get(1);
        //put(4,D)
        lruCache.put(4,"D");

    }
}
