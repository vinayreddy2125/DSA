class Hello {
    public boolean isArmstrong(int n) {
        int original = n;
        int digits = (int)(Math.log10(n) + 1);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }
}

public class AmstrongNumber {
    public static void main(String[] args) {
        int n = 12;

        Hello obj = new Hello();
        boolean ans = obj.isArmstrong(n);

        if (ans)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
