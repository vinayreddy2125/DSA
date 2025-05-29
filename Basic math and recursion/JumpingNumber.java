import java.util.Scanner;

public class JumpingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        if(isJumpingNumber(n))
        {
            System.out.println(n +"Jumping Number");
        }
        else{
            System.out.println(n +" Not Jumping Number");
            int nextnumber=nextJumping(n);
            System.out.println( "Next Jumping Number="+nextnumber);
        }
    }
    public static boolean isJumpingNumber(int n)
    {
        int prevdigit=n%10;
        n/=10;
        while(n>0)
        {
            int currdigit=n%10;
            if(Math.abs(currdigit-prevdigit)!=1)
                return false;
            prevdigit=currdigit;
            n/=10;
        }
        return true;
    }
    public static int nextJumping(int n)
    {
        n--;
        while(!isJumpingNumber(n))n--;
        return  n;
    }
    
}
