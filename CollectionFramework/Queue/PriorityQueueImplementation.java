package CollectionFramework.Queue;

//import java.util.Comparator;
import java.util.PriorityQueue;
//*******to convert min heap into maxheap      ******/
// class mycomp implements Comparator<Integer> {
//     public int compare(Integer o1, Integer o2) {
//         if (o1 < o2) return 1;   // Higher value gets higher priority
//         else if (o1 > o2) return -1;
//         else return 0;
//     }
// }

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>(new mycomp());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(27);
        pq.add(37);
        pq.add(43);
        pq.add(5);

        System.out.println("Min heap head (Lowest) is deleted = " + pq.poll());

        System.out.println("Remaining elements:");
        pq.forEach(x -> System.out.println(x));
    }
}
