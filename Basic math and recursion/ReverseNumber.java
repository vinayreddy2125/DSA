import java.util.Scanner;

class Hello {
    public int reverseNumber(int n, int rev) {
        if (n == 0) return rev;  // base case
        rev = rev * 10 + n % 10; // accumulate reversed digits
        return reverseNumber(n / 10, rev); // recursive call
    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        Hello h = new Hello();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int res = h.reverseNumber(n, 0);
        System.out.println("Reverse of " + n + " = " + res);
    }
}
