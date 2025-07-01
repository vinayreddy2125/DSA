package CollectionFramework.MapInterface;
import java.util.*;
public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"vinay");
        hm.put(2,"Sai");
        hm.put(2,"Bhanu");//overwrites 
        System.out.println(hm);
        for(Map.Entry<Integer,String> entry:hm.entrySet())
        {
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value+" ");
        }
    }
}
