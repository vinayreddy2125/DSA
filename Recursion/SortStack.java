package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {

    // Function to sort stack
    public static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop();      // take out top
            sortStack(s);           // sort remaining
            insertSorted(s, top);   // insert in correct place
        }
    }

    // Helper: insert element in sorted order
    public static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
        } else {
            int top = s.pop();
            insertSorted(s, x);
            s.push(top);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            s.push(sc.nextInt());
        }

        sortStack(s);

        System.out.println("Sorted stack (smallest at bottom): " + s);
    }
}
