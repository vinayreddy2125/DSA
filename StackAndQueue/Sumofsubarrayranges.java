package StackAndQueue;

import java.util.Scanner;

public class Sumofsubarrayranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        StringBuilder str=new StringBuilder("vinay");
        str.insert(0,'c');
        System.out.println(str);
        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                min=Math.min(min,arr[j]);
                max=Math.max(max,arr[j]);
                sum+=max-min;
            }
            
        }
        System.out.println(sum);
    }
    
}
