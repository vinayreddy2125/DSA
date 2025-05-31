import java.util.Scanner;

public class CompressString {
    public static void compress(String s)
    {
        //fs+=" ";
        String res="";
        int cnt=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            cnt++;
            else
            {
            res+=s.charAt(i)+Integer.toString(cnt);
            cnt=1;
            }
        }
        res+=s.charAt(s.length()-1)+Integer.toString(cnt);
        System.out.print(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        compress(input);sc.close();
    }
}