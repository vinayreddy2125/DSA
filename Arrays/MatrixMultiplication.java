package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows in the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter no of cols in the first matrix: ");
        int cols1 = sc.nextInt();
        int arr1[][] = new int[rows1][cols1];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++)
                arr1[i][j] = sc.nextInt();
        }
        System.out.print("Enter no of rows in the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter no of cols in the second matrix: ");
        int cols2 = sc.nextInt();
        int arr2[][] = new int[rows2][cols2];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++)
                arr2[i][j] = sc.nextInt();
        }
        int res[][]=new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++)
                for(int k=0;k<rows1;k++)
                {
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++){
                System.out.print(res[i][j]+" ");}
                System.out.println();
        }sc.close();
        
    }
        
}
