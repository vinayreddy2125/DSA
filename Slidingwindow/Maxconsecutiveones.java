package Slidingwindow;

import java.util.Scanner;

public class Maxconsecutiveones {
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

        int maxlen = 0, zeros = 0;
        int left = 0, right = 0;

        while (right < n) {
            
            if (arr[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (arr[left] == 0) {
                    zeros--;
                }
                left++;
            }


            if(zeros<=k)
            maxlen = Math.max(maxlen, right - left + 1);


            right++;
        }

        System.out.println("maxcount = " + maxlen);
    }
}
