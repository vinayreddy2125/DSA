package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large)
            {
                slarge=large;
                large=arr[i];
            }
            else if(arr[i]>slarge && arr[i]!=large)
            slarge=arr[i];
        }
        System.out.println(" Second Largest element="+ slarge);
        //Arrays.sort(arr);
        //System.out.println(" Second Largest element="+ arr[n-2]);
        sc.close();
    }
}
