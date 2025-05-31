import java.util.Scanner;

public class Arraycount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of the array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements=");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements=");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int hash[]=new int[26];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" occured ="+hash[arr[i]]+" times");
        }
        System.out.println("enter no of queries=");
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int number=sc.nextInt();
            System.out.println("no of times "+ number+ "occured=" +hash[number]);
        }sc.close();
    }
}