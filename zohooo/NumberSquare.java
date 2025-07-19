import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter n=");
        int n=sc.nextInt();
        if(n<0){
            System.out.print("Validation Failed .The given number is not a non-negative number");
        }
        else{
            int low=0;int high=n;
            while(low<=high){
                int mid=(low+high)/2;
                if(mid*mid<=n)low=mid+1;
                else
                high=mid-1;
            }
            System.out.print(high);
        }sc.close();
    }
    
}
