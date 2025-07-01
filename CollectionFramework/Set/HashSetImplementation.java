package CollectionFramework.Set;

import java.util.*;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.remove(20);
        System.out.println(hs.getClass());
        System.out.print(hs);
    }
    
}
