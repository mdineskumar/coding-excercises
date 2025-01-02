package datastructure.hashtable;

public class Entry <K,V>{
    K key;
    V value;
    int hash;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        hash = this.key.hashCode();
    }

    public boolean equals(Entry<K,V> other){
        if(other.hash != this.hash) return false;
        return key.equals(other.key);
    }

    @Override
    public String toString() {
        return key + "=>" + value;
    }
}
