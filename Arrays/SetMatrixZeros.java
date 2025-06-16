package Arrays;
import java.util.Scanner;

public class SetMatrixZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows in the array: ");
        int n = sc.nextInt();
        System.out.print("Enter no of cols in the array: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }

        int col0 = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (j != 0) {
                        arr[0][j] = 0;
                    } else
                        col0 = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0)
                    arr[i][j] = 0;
            }
        }

        if (arr[0][0] == 0) {
            for (int j = 0; j < m; j++)
                arr[0][j] = 0;
        }

        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }

        System.out.println("OUTPUT MATRIX");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
