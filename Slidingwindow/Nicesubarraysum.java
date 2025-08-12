package Slidingwindow;

import java.util.Scanner;

public class Nicesubarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");
        int n = sc.nextInt();

        System.out.print("Enter value of k = ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) { // ✅ fixed increment variable
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
                if(sum>k)break;
            }
        }

        System.out.println("No of subarrays = " + count);
        sc.close();
    }
}
