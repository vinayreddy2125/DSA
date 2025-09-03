import java.util.*;

public class PalindromeRemovals {
    // check if string can be rearranged into a palindrome
    public static boolean canFormPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int val : freq.values()) {
            if (val % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.next();
        int n = str.length();
        int result = Integer.MAX_VALUE;

        int left = 0, right = n - 1;

        // Try removing from left side
        while (left < n) {
            String sub = str.substring(left, n);
            if (canFormPalindrome(sub)) {
                result = Math.min(result, left);
                break; // no need to continue, left is minimum already
            }
            left++;
        }

        // Try removing from right side
        while (right >= 0) {
            String sub = str.substring(0, right + 1);
            if (canFormPalindrome(sub)) {
                result = Math.min(result, n - 1 - right);
                break; // same reason
            }
            right--;
        }

        System.out.println("Minimum removals = " + result);sc.close();
    }
}
