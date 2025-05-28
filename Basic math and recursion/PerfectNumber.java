import java.util.Scanner;

public class PerfectNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n = ");
            int n = sc.nextInt(),sum=0;
            for(int i=1;i<=Math.sqrt(n);i++)
            {
                if((n%i)==0)
                {
                        sum+=i;
                        if((n/i!=i) && (n!=n/i))sum+=n/i;
                }
            }
            System.out.println(n==sum?"PerfectNumber":"NotPerfectNumber");
        }
    }