import java.util.Scanner;

public class PRIME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        int cnt=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                cnt++;
                if((n/i)!=i)
                cnt++;
            }
        }
        if(cnt==2)System.out.println(n + " is prime");
        else System.out.println(n + " not prime");
    }
    
}
