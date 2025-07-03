package StackAndQueue;

import java.util.Scanner;

class QueueUsingArray {
    int front, rear, n;
    int[] arr;

    QueueUsingArray(Scanner sc) {
        System.out.print("Enter size of the Queue: ");
        n = sc.nextInt();
        arr = new int[n];
        front = rear = -1;
    }

    public void enqueue(int val) {
        if (rear == n - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) front = 0;
        arr[++rear] = val;
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Dequeued: " + arr[front++]);

        if (front > rear) {
            // Reset pointers if queue is empty
            front = rear = -1;
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue Elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void isEmpty() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is Not Empty");
        }
    }

    public void isFull() {
        if (rear == n - 1) {
            System.out.println("Queue is Full");
        } else {
            System.out.println("Queue is Not Full");
        }
    }

    public void queueFront() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + arr[front]);
        }
    }
}

public class ArrayQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingArray q = new QueueUsingArray(sc);
        int op;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Front Element");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.isEmpty();
                    break;
                case 5:
                    q.isFull();
                    break;
                case 6:
                    q.queueFront();
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
