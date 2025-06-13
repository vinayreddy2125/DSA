package Arrays;

import java.util.Scanner;

public class SortedArrayOrNot {
    public static boolean issorted(int arr[])
    {
        int n=arr.length;int cnt=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1%n])cnt++;
        }if(cnt>1)
        return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(issorted(arr));
        sc.close();
    }
}
