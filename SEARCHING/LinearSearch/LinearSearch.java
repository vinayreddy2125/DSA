import java.util.Scanner;

public class LinearSearch {
    public static int Lsearch(int arr[],int n,int target)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
               return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array=");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("enter array elements=");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("enter target element=");
        int target=sc.nextInt();
        int result=Lsearch(arr,n,target);
        
        if(result==-1)
        System.out.println("Target not found");
        else
        System.out.println("Target found at "+result);
    }
}