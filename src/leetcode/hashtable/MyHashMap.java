package leetcode.hashtable;

import java.util.Arrays;

public class MyHashMap {
    private static final int EMPTY = -1;// correctly store key 0; 0<=keys<=10^6
    private static final int DELETED = -2;

    int[] keys;
    int[] values;
    int capacity = 10;
    int usedBuckets = 0; // track both active and deleted slots
    int keyCounts = 0; // track only active keys, used for resizeing
    double loadFactor, threshold;
    double DEFAULT_LOAD_FACTOR = 0.65;


    public MyHashMap() {
        keys = new int[capacity];
        values = new int[capacity];
        loadFactor = DEFAULT_LOAD_FACTOR;
        threshold = capacity * loadFactor;

        for(int i =0; i< keys.length;i++){
            keys[i] = EMPTY;
        }
    }

    public void resizeTable(){
        //increase capacity
        capacity = 2 * capacity; //doubling capacirty standard
        threshold = capacity * loadFactor;

        int[] oldKeyArr = keys;
        keys = new int[capacity];

        int[] oldValArr = values;
        values = new int[capacity];

        for(int i =0; i< keys.length;i++){
            keys[i] = EMPTY;
        }

        usedBuckets = 0;
        keyCounts =0;

        for(int i = 0; i < oldKeyArr.length; i++){
            if(oldKeyArr[i] != EMPTY && oldKeyArr[i] != -DELETED){
                put(oldKeyArr[i],oldValArr[i]);
            }
        }
    }
    private int findSlots(int key, boolean forPutting){
        int index = Math.abs(key % capacity);

        int firstDeleted = -1;
        int x = 1;
        while(keys[index] != EMPTY){
            if(keys[index] == key){
                return index;//found key
            }

            if(forPutting && keys[index] == DELETED && firstDeleted == -1){
                firstDeleted = index;
            }

            index= (Math.abs(key % capacity) + p(x))%capacity;
            x=x+1;

            if(x > capacity){
                break;
            }

        }

        if(forPutting && firstDeleted != -1){
            return firstDeleted;
        }
        return index;
    }

    public void put(int key, int value) {
        //need to check threshold exceeded
        if (keyCounts > threshold){
            resizeTable();
        }

        int index = findSlots(key,true);

        if(keys[index] == EMPTY){
            usedBuckets++;
            keyCounts++;

        }else if(keys[index] == DELETED){
            keyCounts++;
        }
//        int x = 1;
//        while(index > 0 &&  index < capacity && keys[index] != 0 && keys[index] != key){
//            index = (key + p(x)) % keys.length;
//            x = x+1;
//        }
//        if(index >= capacity || index < 0){
//            return;
//        }
        keys[index] = key;
        values[index] = value;

    }

    public int hash(int key){
        return key * key;
    }

    public int p(int x){
        return 17*x;
    }

    public int get(int key) {
        int index = findSlots(key, false);

        if(index != -1 && keys[index] == key){
            return values[index];
        }

        return -1;
    }

    public void remove(int key) {
        int index = findSlots(key,false);

        if(index != -1 && keys[index] == key){
            keys[index] = DELETED;
            values[index] = 0;
            keyCounts--;
        }
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "keys=" + Arrays.toString(keys) +
                ", values=" + Arrays.toString(values) +
                ", capacity=" + capacity +
                ", usedBuckets=" + usedBuckets +
                ", loadFactor=" + loadFactor +
                ", threshold=" + threshold +
                ", DEFAULT_LOAD_FACTOR=" + DEFAULT_LOAD_FACTOR +
                '}';
    }
}
