package CollectionFramework.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<Integer> Llist=new LinkedList<>();
        Llist.add(1);
        Llist.add(1);
        Llist.add(2);
        Llist.addFirst(0);
        System.out.println(Llist);
        Llist.removeFirst();
        Llist.removeFirstOccurrence(1);
        System.out.println(Llist);
        Vector<Integer>vc=new Vector<>(List.of(1,2,3,4));
        System.out.println(vc.firstElement());
        System.out.println(vc.lastElement());
        System.out.println(vc.subList(1,3));
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<5;i++){
            sc.push(i);
        }
        sc.pop();
        System.out.println(sc);
    }
    
}
