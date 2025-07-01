package CollectionFramework.List;

import java.util.ArrayList;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> nums=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        numbers.add(0,0 );
        nums.addAll(0, numbers);
        System.out.println(nums);
        for (int num : numbers) {
            System.out.println(num+" ");
        }
    }
}
