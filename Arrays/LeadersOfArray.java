package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeadersOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> res=new ArrayList<>();
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[n-1];res.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
            max=arr[i];
            res.add(arr[i]);
            }
            
        }Collections.reverse(res);
        for(int num:res)
        System.out.print(num);
    }
}
