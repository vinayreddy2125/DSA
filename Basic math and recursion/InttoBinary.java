import java.util.Scanner;

public class InttoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (n > 0) {
            str.insert(0, n % 2);
            n /= 2;
        }

        // // As string
        // String binaryStr = str.toString();
        // System.out.println("Binary String: " + binaryStr);
        // If you want to store it as an int (only works if binary fits in int range)
        int binaryInt = Integer.parseInt(str.toString());
        System.out.println("Binary as integer: " + binaryInt);
        sc.close();
    }
}
