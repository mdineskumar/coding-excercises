package datastructure.hashtable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class HashTableSeparateChaining<K,V> implements Iterator<K> {
    LinkedList<Entry<K,V>>[] table;
    private static final int DEFAULT_CAPACITY = 3;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private double maxLoadFactor;
    private int capacity, threshold, size = 0;
    public HashTableSeparateChaining(){
        this(DEFAULT_CAPACITY,DEFAULT_LOAD_FACTOR);
    }

    public HashTableSeparateChaining(int capacity){
        this(capacity, DEFAULT_LOAD_FACTOR);
    }

    //Designated Constrcuctor
    public HashTableSeparateChaining(int capacity, double maxLoadFactor){
        if(capacity < 0) throw new IllegalArgumentException("Illegal capacity");
        if(maxLoadFactor <= 0 || Double.isNaN(maxLoadFactor) || Double.isInfinite(maxLoadFactor)) throw new IllegalArgumentException("Illegal maxLoadFactor");
        this.maxLoadFactor = maxLoadFactor;
        this.capacity = capacity;
        threshold = (int)(capacity * maxLoadFactor);
        table = new LinkedList[capacity];
    }

    //Return number of elements currently inside the table
    public int size(){
        return size;
    }

    //Return true/false depending on whether hashtable empty or not
    public boolean isEmpty(){
        return size==0;
    }

    //converts a hash value to an index, essentially it strips the
    //negative sign and places the hash value in the domain [0,capacity)
    public int normalizedIndex(int keyHash){
        return (keyHash & 0x7FFFFFFF) % capacity;
    }
    //clears all the contents of the hashtable
    public void clear(){
        Arrays.fill(table,null);
        size = 0;

    }

    public boolean containsKey(K key){
        return hasKey(key);
    }

    //Returns true/false depending on whether a key is in the hash table
    public boolean hasKey(K key){
        int bucketIndex = normalizedIndex(key.hashCode());
        return bucketSeekEntry(bucketIndex, key) != null;
    }

    //FInds and returns the particular entry in the given bucket if it exists, return null otherwise
    public Entry<K,V> bucketSeekEntry(int bucketIndex, K key){
        if (key == null) return null;
        LinkedList<Entry<K,V>> bucket = table[bucketIndex];
        if (bucket == null) return null;
        for(Entry<K,V> e: bucket) if (e.key.equals(key)) return e;
        return null;
    }
    //Insert, put and add all place a value in the hash table
    public V put(K key, V value){
        return insert(key,value);
    }

    public V add(K key , V value){
        return insert(key,value);
    }



    private V insert(K key, V value) {
        if (key == null) throw new IllegalArgumentException("Illegal key");
        Entry<K,V> newEntry = new Entry<>(key,value);
        int bucketIndex = normalizedIndex(newEntry.hash);
        return bucketInsertEntry(bucketIndex,newEntry);

    }

    //inserts an entry in a given bucket only if the entry does not already
    //exist in the given bucket, but if it does update the entry value
    private V bucketInsertEntry(int bucketIndex, Entry<K,V> newEntry){
        LinkedList<Entry<K,V>> bucket = table[bucketIndex];
        if (bucket == null) table[bucketIndex] = bucket = new LinkedList<>();
        Entry<K,V> existentEntry = bucketSeekEntry(bucketIndex,newEntry.key);
        if(existentEntry == null) {
            bucket.add(newEntry);
            if(++size > threshold) resizeTable(); 
            return null; //Use null to indicate that there was no previous entry
        }else{
            V oldValue = existentEntry.value;
            existentEntry.value = newEntry.value;
            return oldValue;
        }
    }

    //Resizes the internal table holding buckets of entries
    private void resizeTable() {
        capacity *= 2;
        threshold = (int) (capacity*maxLoadFactor);
        LinkedList<Entry<K,V>>[] newTable = new LinkedList[capacity];
        for(int i = 0; i < table.length; i++){
            if(table[i] != null){
                for(Entry<K,V> entry : table[i]){
                    int bucketIndex = normalizedIndex(entry.hash);
                    LinkedList<Entry<K,V>> bucket = newTable[bucketIndex];
                    if (bucket == null) newTable[bucketIndex] = bucket = new LinkedList<>();
                    bucket.add(entry);
                }
                //Avoid memory leaks. Help the GC
                table[i].clear();
                table[i] = null;
            }
        }
        table = newTable;
    }


    //gets a key's value from the map and returns the value.
    //NOTE: returns null if the value is null AND also returns
    //null if the key does not exists.
    public V get(K key){
        if (key == null) return null;
        int bucketIndex = normalizedIndex(key.hashCode());
        Entry<K,V> entry = bucketSeekEntry(bucketIndex,key);
        if (entry != null) return entry.value;
        return null;
    }

    //removes a key from the map and returns the value
    //NOTE: returns null if the value is null AND also returns
    //null if the key does not exists.

    public V remove(K key){
        if (key == null) return null;
        int bucketIndex = normalizedIndex(key.hashCode());

        return bucketRemoveEntry(bucketIndex,key);
    }

    private V bucketRemoveEntry(int bucketIndex, K key) {
        Entry<K,V> entry = bucketSeekEntry(bucketIndex,key);
        if (entry == null) return null;
        LinkedList<Entry<K,V>> links = table[bucketIndex];
        links.remove(entry);
        --size;
        return entry.value;

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public K next() {
        return null;
    }

    // Returns a string representation of this hash table
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < capacity; i++) {
            if (table[i] == null) continue;
            for (Entry<K, V> entry : table[i]) sb.append(entry + ", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
