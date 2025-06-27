package LinkedList;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoubleLinkedList{
    Node head;
    DoubleLinkedList()
    {
        head=null;
    }
    public void AddFirst(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;   
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void AddLast(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            head.next=null;
            head.prev=null;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.prev=currNode;
        newNode.next=null;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("DLL is empty");
            return;
        }
        Node curNode=head;
        while(curNode!=null)
        {
            System.out.print(curNode.data +"->");
            curNode=curNode.next;
        }
        System.out.println("null");
    }
    public void DeleteFirst()
    {
        if(head==null)
        {
            System.out.println("DLL is Empty!!!");
            return;
        }
        head=head.next;
    }
    public void DeleteLast()
    {
        if(head==null)
        {
            System.out.println("DLL is Empty!!!");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node curNode=head;
        while(curNode.next.next!=null)
        {
            curNode=curNode.next;
        }
        curNode.next=null;
    }
}
public class DLL {
    public static void main(String[] args) {
        DoubleLinkedList ll=new DoubleLinkedList();
        Scanner sc=new Scanner(System.in);
        int op;
        do{
            System.out.println("1.AddFirst\n2.AddLast\n3.Display\n4.DeleteFirst\n5.DeleteLast\n0.Exit\nEnter your option=");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value=");
                    int val=sc.nextInt();
                    ll.AddFirst(val);
                    break;
                case 2:
                    System.out.print("Enter value=");
                    int value=sc.nextInt();
                    ll.AddLast(value);
                    break;
                case 3:
                    ll.display();
                    break;
                case 4:
                    ll.DeleteFirst();
                    break;
                case 5:
                    ll.DeleteLast();
                    break;
                case 0:
                    System.out.print("EXITING");
                    break;
                default:
                    System.out.print("Invalid option");
                    break;
            }

        }while(op!=0);
    }
    
}
