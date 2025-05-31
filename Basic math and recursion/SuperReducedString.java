import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            int len = result.length();
            if (len > 0 && result.charAt(len - 1) == ch) {
                // Remove the last character if it's the same
                result.deleteCharAt(len - 1);
            } else {
                result.append(ch);
                System.out.println(result.toString());
            }
        }

        // Final output
        if (result.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println("Super Reduced String: " + result.toString());
        }
    }
}
