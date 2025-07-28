import java.util.Scanner;

class Hashtablee {
    int table[];
    int size;

    Hashtablee(int size) {
        this.size = size;
        table = new int[size];
        // initialize with -1 (empty slots)
        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }

    // Simple hash function: key % size
    int hash(int key) {
        return key % size;
    }

    // Insert using linear probing
    void insert(int key) {
        int index = hash(key);
        int startIndex = index;
        while (table[index] != -1) { // find next empty slot
            index = (index + 1) % size;
            if (index == startIndex) {
                System.out.println("Hash table is full! Cannot insert.");
                return;
            }
        }
        table[index] = key;
        System.out.println("Inserted " + key + " at index " + index);
    }

    // Search using linear probing
    void search(int key) {
        int index = hash(key);
        int startIndex = index;
        while (table[index] != -1) {
            if (table[index] == key) {
                System.out.println("Found " + key + " at index " + index);
                return;
            }
            index = (index + 1) % size;
            if (index == startIndex) break;
        }
        System.out.println("Key not found.");
    }
}

public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of table = ");
        int size = sc.nextInt();
        Hashtablee ht = new Hashtablee(size);

        int op;
        do {
            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("0. Exit");
            System.out.print("Enter your Option = ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int key = sc.nextInt();
                    ht.insert(key);
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    int key1 = sc.nextInt();
                    ht.search(key1);
                    break;
                case 0:
                    System.out.println("EXITING");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (op != 0);
        sc.close();
    }
}
