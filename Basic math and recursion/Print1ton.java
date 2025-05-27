class Hello {
    public void print(int n, int m) {
        if (n < m) return;  // base case
        System.out.println(n);
        print(n - 1, m);    // recursive call
    }
}

public class Print1ton{
    public static void main(String[] args) {
        Hello h = new Hello();
        h.print(5, 1);  // Prints 1 to 6
    }
}
