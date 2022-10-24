package hashing_08.implemention_of_chaining_01;

import java.util.ArrayList;
import java.util.LinkedList;

class MyHash {
    int BUCKET;

    ArrayList<LinkedList<Integer>> table;

    MyHash(int b) {
        BUCKET = b;

        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key) {
        int i = key % BUCKET;
        table.get(i).add(key);
    }

    boolean search(int key) {
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }

    void remove(int key) {
        int i = key % BUCKET;
        table.get(i).remove(i);
    }

    @Override
    public String toString() {
        return "MyHash{" +
                "BUCKET=" + BUCKET +
                ", table=" + table +
                '}';
    }
}

public class MainDriver {

    public static void main(String[] args) {
        // creating object of class MyHash
        MyHash myHash = new MyHash(7);

        // adding value
        myHash.insert(70);
        myHash.insert(71);
        myHash.insert(9);
        myHash.insert(56);
        myHash.insert(72);

        // searching data
        System.out.println(myHash.search(70));

        // removing value
        myHash.remove(70);

        // again searching for same value after remove that value from table
        System.out.println(myHash.search(70));

        System.out.println(myHash);
    }
}