import java.util.ArrayList;
import java.util.Scanner;

public class MagicalNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
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
        int res[]=new int[10];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]<k)
                {
                    al.add(i);
                    al.add(j);
                    ans.add(al);                
                }
            }
        }
            System.out.print(ans.get(0));
        
        
        }
        
    }
    
}
// HashMap<Integer,Integer> map=new HashMap<>();
            // for(int i=0;i<n;i++){
            //     map.put(arr[i],i);
            // }
            // int start=0;int end=1;
            // int presum=0;
            // while(end<=n)
            // {
            //     presum=arr[start]+arr[end];
            //     while(presum>=k){
                    
            //         start++;
            //         if(end<n)
            //         end=start+1;
            //         presum=arr[start]+arr[end];
            //     }
                
            //     System.out.println(map.get(arr[start])+","+map.get(arr[end]));
            //     if(end<n)end++;
            // }
