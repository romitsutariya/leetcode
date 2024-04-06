import java.util.LinkedList;
import java.util.Objects;

class MyHashSet {
    int size = 1000;
    LinkedList<Integer>[] data;

    public MyHashSet() {
        this.data = new LinkedList[size];
    }

    public void add(int key) {
        int hash = hash(key);
        LinkedList<Integer> bucket = data[hash];
        if (Objects.isNull(bucket)) {
            System.out.println("Creating new LinkedList");
            LinkedList<Integer> newNode = new LinkedList<>();
            newNode.add(key);
            data[hash] = newNode;
        } else if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int hash = hash(key);
        LinkedList<Integer> bucket = data[hash];
        if (Objects.nonNull(bucket)) {
            data[hash].removeFirstOccurrence(key);
        }
    }

    public boolean contains(int key) {
        int hash = hash(key);
        LinkedList<Integer> bucket = data[hash];
        if (Objects.nonNull(bucket)) {
            return bucket.contains(key);
        }
        return Boolean.FALSE;
    }

    private int hash(int key) {
        return key % size;
    }

}