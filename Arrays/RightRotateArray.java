package Arrays;

import java.util.*;

public class RightRotateArray {
    public static void rightRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle k > n

        // Reverse whole array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining n-k elements
        reverse(arr, k, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rightRotate(arr, k);

        System.out.println("Array after right rotation:");
        System.out.println(Arrays.toString(arr));
    }
}

