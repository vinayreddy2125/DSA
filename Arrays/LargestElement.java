package Arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)max=arr[i];
        }
        System.out.println("Largest element="+ max);
        //Arrays.sort(arr);
        //System.out.println("Largest element="+ arr[n-1]);
        sc.close();
    }
}
