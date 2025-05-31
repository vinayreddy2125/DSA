import java.util.Scanner;

public class RevserseSpclString
{
    public static void reverse(char c[],int start,int end)
    {
        while(start<end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        char c[]=input.toCharArray();int left=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=c[i];
            if(Character.isDigit(ch)
            || !Character.isAlphabetic(ch) && !Character.isDigit(ch)|| ch==' ')
            {
                reverse(c,left,i-1);
                left=i+1;
            }
        }
        for(char c1:c)
            System.out.print(c1);sc.close();
    }
}