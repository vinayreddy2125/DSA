package Slidingwindow;

import java.util.Scanner;

public class Maxsumfromcards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array = ");
        int n = sc.nextInt();

        System.out.print("Enter value of k = ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += arr[i];
        }
        int maxSum = leftSum;


        int rightIndex = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            leftSum -= arr[i];       
            leftSum += arr[rightIndex]; 
            rightIndex--;

            maxSum = Math.max(maxSum, leftSum);
        }

        System.out.println("Max sum = " + maxSum);

        sc.close();
    }
}
