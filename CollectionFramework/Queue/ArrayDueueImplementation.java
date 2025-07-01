package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDueueImplementation {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>(); 
        
        dq.offerFirst(-1);
        dq.addFirst(0);
        dq.offer(1);//same as offerLast means adding element at last
        dq.add(2);
        dq.addLast(3);
        dq.offerLast(4);
        dq.removeFirst();
        dq.removeLast();
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq.peekFirst()+" "+dq.peekLast());
        dq.forEach((x)->System.out.print(x+" "));
    }
    
}
