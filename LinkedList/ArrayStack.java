package LinkedList;

import java.util.Scanner;

class StackUsingArray {
    int n;
    int[] arr;
    int top;

    StackUsingArray(Scanner sc) {
        System.out.print("Enter size of the Stack: ");
        n = sc.nextInt();
        arr = new int[n];
        top = -1;
    }

    public void push(int val) {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + arr[top--]);
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
    }

    public void isFull() {
        if (top == n - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is Not Full");
        }
    }

    public void stackTop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + arr[top]);
        }
    }
}

public class ArrayStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingArray s = new StackUsingArray(sc);
        int op;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. StackTop");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.isEmpty();
                    break;
                case 5:
                    s.isFull();
                    break;
                case 6:
                    s.stackTop();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (op != 0);

        sc.close();
    }
}
