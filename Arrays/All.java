package Arrays;

import java.util.*;
import java.util.Scanner;
class Name{
    public int findfirst(int arr[],int target){
        int low=0;int high=arr.length-1;int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]>target)high=mid-1;
            else low=mid+1;
        }
        return first;
    }
    public int findlast(int arr[],int target){
        int low=0;int high=arr.length-1;int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return last;
    }
}
public class All {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Name obj=new Name();
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target element:");
        int x=sc.nextInt();
        if(obj.findfirst(arr, x)==-1)
        System.out.println("No Such Element Found");
        else{
        int first=obj.findfirst(arr, x);
        int last=obj.findlast(arr, x);
        System.out.print(last-first+1);
        }
      
    sc.close();
    }
}

/*     ----- Largest Element in the array------
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Largest element in the array="+max);

        ----- Second Largest Element in the array------

        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>large){
                slarge=large;
                large=num;
            }
            else if(num>slarge && num!=large){
                slarge=num;
            }
        }
        System.out.println("Second largest element="+slarge);

        ----- Second Smallest Element in the array------

        int small=Integer.MAX_VALUE;
        int ssmall=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<small){
                ssmall=small;
                small=num;
            }
            else if(num<ssmall && num!=small){
                ssmall=num;
            }
        }
        System.out.println("Second smallest element="+ssmall);

        ----- check is array is rotated sorted -----

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n])
            count++;
        }
        System.out.println(count<=1?"true":"false");

        ---Removing duplicates from the sorted array-----

        int i=1;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[j-1]){
                arr[i]=arr[j];
                i++;
            }
        }
        System.err.println("array after removing duplicates=");
        int m=arr.length;
        for(int k=0;k<m;k++){
            System.out.println(arr[k]+" ");
        }
        sc.close();

        --Move zeros to end-----

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;j++;
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(arr[i]+" ");

        ----union of two sorted arrays----

        // Input array1
        System.out.print("Enter size of the array1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter array1 elements (sorted):");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input array2
        System.out.print("Enter size of the array2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter array2 elements (sorted):");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;
        int merged[] = new int[n1 + n2];

        // Merge two sorted arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (k == 0 || merged[k - 1] != arr1[i])  // handle duplicates
                    merged[k++] = arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || merged[k - 1] != arr2[j])
                    merged[k++] = arr2[j];
                j++;
            } else { // Equal elements
                if (k == 0 || merged[k - 1] != arr1[i])
                    merged[k++] = arr1[i];
                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < n1) {
            if (k == 0 || merged[k - 1] != arr1[i])
                merged[k++] = arr1[i];
            i++;
        }

        // Remaining elements of arr2
        while (j < n2) {
            if (k == 0 || merged[k - 1] != arr2[j])
                merged[k++] = arr2[j];
            j++;
        }

        System.out.println("Merged array without duplicates:");
        for (int m = 0; m < k; m++) {
            System.out.print(merged[m] + " ");
        }

        ----TWO SUM------

        System.out.print("Enter target Element: ");
        int target = sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n-1;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                System.out.println("["+map.get(complement)+","+i+"]");
            }
            map.put(arr[i],i);
        }
        System.out.println("No such pair");

        ----sort 0's 1's,2's -----

        int low=0,high=n-1,mid=0;
        for(int i=0;i<n;i++){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }

        ----Majority element n/2----

        int mini=(int)n/2+1;
        int count=0,ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=arr[i];
                count++;
            }
            else if(ele==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int num:arr){
            if(num==ele)count1++;
        }
        System.out.print(count1>=mini?ele:-1);

        ----Best time to busy and sell-----

        int maxprofit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            maxprofit=Math.max(maxprofit,arr[i]-min);
        }
        System.out.println(maxprofit);

        -----next permutation---

         public static void nextpermutation(int arr[],int n){
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;break;
            }
        }
        if(index==-1){
            reverse(arr, 0,n-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        reverse(arr, index+1, n-1);

    }
    public static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }


    -----SET MATRIX ZEROS------

    int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][0]==0|| arr[0][j]==0)arr[i][j]=0;
            }
        }

        if (arr[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }

        // Step 4: Handle the first column
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
        System.out.println("result matrix=");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.err.println(arr[i][j]);
            }
        }

        -------SPIRAL MATRIX--------

        ArrayList<Integer> ans=new ArrayList<>();
        int top=0,bottom=n-1,left=0,right=m-1;
        while (left<=right && top<=bottom) {
            for(int i=left;i<=right;i++){
                ans.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(arr[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(arr[left][i]);
                }
            }
            left++;
        }
        System.out.println(ans);
 */
