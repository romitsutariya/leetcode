import java.util.LinkedList;
class MyHashSet {
    private static final int SIZE = 10000; // Size of the hash set array
    private LinkedList<Integer>[] buckets; // Array of linked lists to store key-value pairs

    /** Initialize your data structure here. */
    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    /** Adds a key into the HashSet. */
    public void add(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = buckets[index];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }
    
    /** Removes the specified element from the HashSet if present. */
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = buckets[index];
        bucket.remove(Integer.valueOf(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }
    
    /** Hash function to map a key to an index */
    private int hash(int key) {
        return key % SIZE;
    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */