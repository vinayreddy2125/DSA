import java.util.Scanner;
public class ReverseStringInRange {
    public static void reverse(char c[],int start,int end)
    {
        while(start<end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;end--;
        }
        System.out.println("Reverse String="+new String(c));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String s=sc.nextLine();
        System.out.print("Enter Start range=");
        int start=sc.nextInt();
        System.out.print("Enter end range=");
        int end=sc.nextInt();
        char c[]=s.toCharArray();
        if (start < 0 || end >= s.length() || start > end) {
            System.out.println("Invalid Range");
        }
        else{
            reverse(c,start,end);
        }
        sc.close();
    }
}


