package Slidingwindow;

import java.util.Scanner;

public class Subarraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter  size of the array=");
        int n=sc.nextInt();
        System.err.print("Enter  value of k=");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxlen=0,sum=0;
        int left=0,right=0;
        while(right<n){
            sum+=arr[right];
            if(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum<=k)
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        System.out.println("maxlen="+maxlen);
        sc.close();
    }
    
}
