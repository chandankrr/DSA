package hashing_08.implemention_of_open_addressing_02;

import java.util.Arrays;

class MyHash {
    int[] arr;
    int cap, size;

    MyHash(int c) {
        cap = c;
        size = 0;

        for (int i = 0; i < cap; i++) {
            arr[i] = -1;
        }
    }

    int hash(int key) {
        return key % cap;
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;

        while (arr[i] != -1) {
            if (arr[i] == key)
                return true;

            i = (i + 1) % cap;

            if (i == h)
                return false;
        }

        return false;
    }

    boolean insert(int key) {
        if (size == cap)
            return false;

        int i = hash(key);

        while(arr[i] != -1 && arr[i] != -2 && arr[i] != key)
            i = (i + 1) % cap;

        if (arr[i] == key)
            return false;
        else{
            arr[i] = key;
            size++;
            return true;
        }
    }

    boolean erase(int key) {
        int h = hash(key);

        int i = h;

        while(arr[i] != -1) {
            if (arr[i] == key) {
                arr[i] = -2;
                return true;
            }

            i = (i + 1) % cap;

            if (i == h)
                return false;
        }

        return false;
    }

    @Override
    public String toString() {
        return "MyHash{" +
                "arr=" + Arrays.toString(arr) +
                ", cap=" + cap +
                ", size=" + size +
                '}';
    }
}

public class MainDriver {

    public static void main(String[] args) {
        /* MyHash myHash = new MyHash(7);

        myHash.insert(53);
        myHash.insert(45);
        myHash.insert(21);
        myHash.insert(12);

        myHash.search(45);

        myHash.erase(21);

        myHash.search(21);

        myHash.insert(21);

        System.out.println(myHash); */
    }
}
