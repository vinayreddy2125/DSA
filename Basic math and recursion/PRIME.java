public class PRIME {
    public static void main(String[] args) {
        int n=4;
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
