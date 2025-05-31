import java.util.Scanner;

public class EvenCharacters {
    public static boolean iseven(int n)
    {
        if(n%2==0)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String s=sc.nextLine();
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++)
        {
            int a=s.charAt(i);
            if(iseven(a))
                res+=s.charAt(i);
        }
        System.out.println(res);sc.close();
    }
    
}
