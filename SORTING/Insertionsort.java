import java.util.Scanner;

public class Insertionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j>0;j--)
        //     {
        //         if(arr[j]<arr[j-1])
        //         {
        //             int temp=arr[j];
        //             arr[j]=arr[j-1];
        //             arr[j-1]=temp;
        //         }
        //     }
        // }
        for(int i=0;i<n;i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]) {
                // Swap logic
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        
        System.out.print(" sorted array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }sc.close();
    }
}
        