import java.util.Scanner;

class Hello {
    public int print(int n, int m) {
        if (n > m) return 1; // base case
        return n * print(n + 1, m); // accumulate as you go forward
    }
}
public class FACTORIAL {
    public static void main(String[] args) {
        Hello h = new Hello();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int res = h.print(1, n);
        System.out.println("Factorial of  " + n + " = " + res);sc.close();
    }
}
