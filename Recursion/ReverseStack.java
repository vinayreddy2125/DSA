package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    // Function to reverse the stack
    public static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop();   // remove top
            reverse(s);          // reverse rest
            insertAtBottom(s, top); // insert removed element at bottom
        }
    }

    // Helper function to insert element at bottom of stack
    public static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x); // base case
        } else {
            int top = s.pop();
            insertAtBottom(s, x); // keep going until empty
            s.push(top);          // push back after inserting
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            s.push(sc.nextInt());
        }

        reverse(s);

        System.out.println("Reversed stack: " + s);
    }
}
