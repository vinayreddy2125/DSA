package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int count = 0;  // index for placing non-zero elements

        // First pass: move all non-zeros to front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Second pass: fill remaining positions with 0
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12, 0, 4, 0, 5};

        moveZeros(arr);

        System.out.println("Array after moving zeros:");
        System.out.println(Arrays.toString(arr));
    }
}

