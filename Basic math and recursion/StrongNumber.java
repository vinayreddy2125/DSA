import java.util.Scanner;
public class StrongNumber {
    public static int fact(int n)
    {
        if(n==0)return 1;
        return n*fact(n-1);
    }
    public static boolean isStrongNUmber(int n)
    {
        int sum=0,temp=n;
        while(n>0)
        {
            sum+=fact(n%10);
            n/=10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number=");
        int n=sc.nextInt();
        System.out.println("Strong numbers between 100 to n");
        for(int i=0;i<=n;i++)
        {
        if(isStrongNUmber(i))
        System.out.print(i +" ");
        }
        sc.close();
    }
    
}
