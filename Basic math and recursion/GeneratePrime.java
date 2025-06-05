import java.util.Scanner;
public class GeneratePrime {
    public static boolean isprime(int n)
    {
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                cnt++;
                if(n/i!=i)cnt++;
            }
    }
    return cnt==2;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of prime numbers: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter  starting number to generate prime numbers:");
        int number=sc.nextInt();
        int k=0;
        while(n>0)
        {
            if(isprime(number))
            {
                arr[k++]=number;
                n--;
            }
            number++;
        }
        System.out.print(" Prime Numbers=");
        for (int num:arr) 
        {
            System.out.print(num+" ");
        }sc.close();
    }
}
        