package Arrays;

import java.util.*;

public class UnionOfSortedArrays {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter  array1 elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter  array2 elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int it:map.keySet())al.add(it);
        System.out.println(al);
        sc.close();
    }
}
