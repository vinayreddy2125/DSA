import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MAgicNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array=");
                
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter value of k=");
                
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[0]+arr[1]>=k){
            System.out.print("No valid Pair");
        }
        else{
            int start=0;
            int end=n-1;
            for(int i=0;i<n;i++)
            {
                int j=i+1;
                while(j<n && arr[i]+arr[j]<k)
                {
                    System.out.println(i+","+j);
                    j++;
                }
            }
            
        }
        }
    }
    

