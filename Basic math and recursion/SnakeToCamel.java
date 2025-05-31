import java.util.Scanner;

public class SnakeToCamel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter snake_case string: ");
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') {
                str.deleteCharAt(i);
                char next = str.charAt(i);
                str.setCharAt(i, Character.toUpperCase(next)); // replace next char with uppercase
            }
        }

        System.out.println("camelCase: " + str.toString());
    }
}
