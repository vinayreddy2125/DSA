import java.util.Scanner;

public class RecursiveFactorial {
    public static int fact(int n)
    {
        if(n==0)return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n=");
        int n=sc.nextInt();
        System.out.println(fact(n));sc.close();
    }
    
}
