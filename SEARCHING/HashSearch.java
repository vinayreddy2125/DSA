import java.util.Scanner;
//Hashed search using linear probing
class HashTable {
    int[] table;
    int size;

    HashTable(int size) {
        this.size = size;
        table = new int[size];
        for (int i = 0; i < size; i++) table[i] = -1;
    }

    void insert(int key) {
        int idx = key % size;
        while (table[idx] != -1) {
            idx = (idx + 1) % size;  // Linear probing
        }
        table[idx] = key;
    }

    boolean search(int key) {
        int idx = key % size;
        int startIdx = idx;
        while (table[idx] != -1) {
            if (table[idx] == key) return true;
            idx = (idx + 1) % size;
            if (idx == startIdx) break; // full cycle
        }
        return false;
    }
}

public class HashSearch {
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.insert(21);
        ht.insert(31);
        ht.insert(41);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        if (ht.search(key))
            System.out.println("Key found.");
        else
            System.out.println("Key not found.");sc.close();
    }
}
