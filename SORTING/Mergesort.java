import java.util.Scanner;

public class Mergesort {

    // Merge two sorted subarrays
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] res = new int[high - low + 1];
        int left = low, right = mid + 1, k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                res[k++] = arr[left++];
            } else {
                res[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            res[k++] = arr[left++];
        }

        while (right <= high) {
            res[k++] = arr[right++];
        }

        // Copy back the merged elements
        for (int i = 0; i < res.length; i++) {
            arr[low + i] = res[i];
        }
    }

    // Merge sort function
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.print("Sorted array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
