package CollectionFramework.MapInterface;

// import java.util.LinkedHashMap;
// import java.util.LinkedHashSet;
// import java.util.TreeMap;
    import java.util.*;
public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(10,"vinay");
        lhm.put(3,"Sai");
        lhm.put(2,"Bhanu"); 
        System.out.println(lhm);
        for(Map.Entry<Integer,String> entry:lhm.entrySet())
        {
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value+" ");
        }
    }
    
}
