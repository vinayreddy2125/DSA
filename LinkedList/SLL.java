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

    public void insertany(int value,int bnodedata){
        Node newnNode=new Node(value);
        if(head.data==bnodedata){
            head.next=newnNode;
            return;
        }
        Node currNode=head;
        while(currNode!=null && currNode.data!=bnodedata){
            currNode=currNode.next;
        }
        if(currNode==null){
            System.out.print("No such element found to insert");
        }
        
        newnNode.next=currNode.next;
        currNode.next=newnNode;
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
    public void reverse(){
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        head=prev;
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
    public void deleteany(int data){
        if(head==null){
            System.out.println("No such element found to delete");
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node currNode=head;
        Node prev=null;
        while(currNode!=null && currNode.data!=data){
            prev=currNode;
            currNode=currNode.next;
        }
        if(currNode==null){
            System.out.println("No such element found to delete");
        }else
        prev.next=currNode.next;
    }
}

public class SLL {
    public static void main(String[] args) {
        List ll = new List();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.print(
                "1.InsertBeginning\n2.InsertEnd\n3.Display\n4.deleteFirst\n5.deleteLast\n6.searchnode\n7.InsertAny\n8.DeleteAny\n9.Reverse\n0.Exit\nEnter Option="
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
                case 7:
                    System.out.print("enter value to insert=");
                    int d=sc.nextInt();
                    System.out.print("enter value to to insert before this data=");
                    int b=sc.nextInt();
                    ll.insertany(d,b);
                    break;
                 case 8:
                    System.out.print("enter value to delete=");
                    int de=sc.nextInt();
                    ll.deleteany(de);
                    break;
                case 9:
                    ll.reverse();
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
