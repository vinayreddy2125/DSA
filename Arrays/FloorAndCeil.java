package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class FloorAndCeil {
    public static int[] findfloorandceil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return new int[]{arr[mid], arr[mid]};
            } else if (arr[mid] > target) {
                ceil = arr[mid];      // possible ceil
                high = mid - 1;
            } else {
                floor = arr[mid];     // possible floor
                low = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements (any order):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target = ");
        int target = sc.nextInt();

        // Make sure the array is sorted before applying binary search
        Arrays.sort(arr);

        int[] res = findfloorandceil(arr, target);
        System.out.println("Floor = " + res[0]);
        System.out.println("Ceil  = " + res[1]);

        sc.close();
    }
}
 