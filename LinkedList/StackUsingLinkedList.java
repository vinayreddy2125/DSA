package LinkedList;

import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    ListNode head;

    LinkedListStack() {
        head = null;
    }

    public void push(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Popped: " + head.data);
        head = head.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack Elements:");
        ListNode currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public void isEmpty() {
        if (head == null)
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is Not Empty");
    }

    public void isFull() {
        System.out.println("Stack is Never Full (Linked List-based)");
    }

    public void stackTop() {
        if (head == null)
            System.out.println("Stack is Empty");
        else
            System.out.println("Top Element: " + head.data);
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListStack s = new LinkedListStack();
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
