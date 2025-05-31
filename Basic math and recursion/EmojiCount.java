import java.util.Scanner;

public class EmojiCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String input=sc.nextLine();
        System.out.print("Enter emoji=");
        String emoji=sc.nextLine();
        int n=input.length();int cnt=0;
        for(int i=0;i<=n-emoji.length();i++)
        {
            String substr=input.substring(i, i+emoji.length());
            System.out.print(substr+" ");
            if(substr.equals(emoji))
            {
                cnt++;
                i=i+emoji.length()-1;
            }
        }
        System.out.println(cnt);sc.close();
    }
    
}
