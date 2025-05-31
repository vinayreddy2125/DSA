import java.util.Scanner;

public class Selectionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int mini=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[i])mini=j;
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        System.out.print(" sorted array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }sc.close();
    }
}
        