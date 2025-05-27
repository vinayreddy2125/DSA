import java.util.Scanner;

class Hello {
    public int print(int n, int m) {
        if (n > m) return 0; // base case
        return n + print(n + 1, m); // accumulate as you go forward
    }
}

public class BacktrackingNto1 {
    public static void main(String[] args) {
        Hello h = new Hello();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int res = h.print(0, n);
        System.out.println("Sum of numbers from 0 to " + n + " = " + res);
    }
}
