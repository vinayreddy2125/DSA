package Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        
        int[][] matrix = new int[n][m];
        
        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Spiral traversal
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        
        System.out.println("Spiral Order:");
        while(top <= bottom && left <= right) {
            
            // Print top row
            for(int i=left; i<=right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            
            // Print right column
            for(int i=top; i<=bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            
            // Print bottom row (only if top <= bottom)
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            
            // Print left column (only if left <= right)
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        
        sc.close();
    }
}
