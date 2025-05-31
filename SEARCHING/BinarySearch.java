import java.util.Scanner;

public class BinarySearch {
    public static int Bsearch(int arr[], int n, int target) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // To avoid overflow

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int result = Bsearch(arr, n, target);
        if (result == -1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index " + result);sc.close();
    }
}
