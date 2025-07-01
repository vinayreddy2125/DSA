package CollectionFramework.Set;

import java.util.*;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>(List.of(10,20,30,4030,303,0));
        ts.remove(4030);
        System.out.println(ts.ceiling(3));
        Iterator<Integer> itr=ts.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        
    }
    
}
