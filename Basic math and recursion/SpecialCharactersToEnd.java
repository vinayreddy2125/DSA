import java.util.Scanner;

public class SpecialCharactersToEnd {
    public static void swap(char c[],int left,int right)
    {
        char temp=c[left];
        c[left]=c[right];
        c[right]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        char c[]=input.toCharArray();
        int left=0;
        int n=c.length;
        for(int i=0;i<n;i++)
        {
            char ch=c[i];
            if(Character.isLetterOrDigit(ch))
            {
                swap(c,i,left);left++;
            }
        }
        //for(char ch:c)
        System.out.print(c);sc.close();
    }
    
}
