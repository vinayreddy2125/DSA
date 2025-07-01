package CollectionFramework.MapInterface;

//import java.util.Hastmap;
import java.util.*;

public class TreeMapImplementation {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(10,"vinay");
        //tm.put(2,"Sai");
        tm.put(2,"Bhanu"); 
        System.out.println(tm.lastEntry());
        System.out.println(tm);
        for(Map.Entry<Integer,String> entry:tm.entrySet())
        {
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value+" ");
        }
    }
    
}
