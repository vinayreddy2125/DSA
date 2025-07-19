import java.util.*;

public class NextPrimeNumber {
    public static boolean isPrime(int n)
    {
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
        return cnt<=2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.print("Enter Number=");
        int n=sc.nextInt();
        int nextnumber=n+1;
        while(!isPrime(nextnumber)){
            nextnumber++;
        }
        System.out.print("Next Prime number to "+n+" is="+nextnumber);
        sc.close();
    }
}
