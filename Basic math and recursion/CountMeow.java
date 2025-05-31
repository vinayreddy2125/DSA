import java.util.Scanner;

public class CountMeow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String input=sc.nextLine();
        System.out.print("Enter emoji=");
        String emoji=sc.nextLine();

        // Convert both to lowercase to make comparison case-insensitive
        input = input.toLowerCase();
        emoji = emoji.toLowerCase();

        int count = 0;
        for (int i = 0; i <= input.length() - emoji.length(); i++) {
            String sub = input.substring(i, i + emoji.length());
            System.out.print(sub +" ");
            if (sub.equals(emoji)) {
                count++;
                i += emoji.length()-1; // Skip to next non-overlapping
            }
        }

        System.out.println("Count = " + count);
    }
}
