package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head;

    List() {
        head = null; 
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void deleteFirst()
    {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        head=head.next;
    }
    public int searchnode(int val)
    {
        int count=0;
        Node currNode=head;
        while(currNode!=null)
        {
            if(currNode.data==val){return count;}count++;
            currNode=currNode.next;
        }
        return -1;
    }
    public void deleteLast()
    {
        //ll is empty
         if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        //if ll contains only one node
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node currNode=head;
        while(currNode.next.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=null;
    }
}

public class SLL {
    public static void main(String[] args) {
        List ll = new List();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.print(
                "1.InsertBeginning\n2.InsertEnd\n3.Display\n4.deleteFirst\n5.deleteLast\n6.searchnode\n0.Exit\nEnter Option="
            );
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value=");
                    int val = sc.nextInt();
                    ll.insertFirst(val);
                    break;
                case 2:
                    System.out.print("Enter value=");
                    int value = sc.nextInt();
                    ll.insertEnd(value);
                    break;
                case 3:
                    ll.display();
                    break;
                case 4:
                    ll.deleteFirst();
                    break;
                case 5:
                    ll.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter value to search=");
                    int valu = sc.nextInt();
                    System.out.println(ll.searchnode(valu));
                    break;
                case 0:
                    System.out.println("EXITING");
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
