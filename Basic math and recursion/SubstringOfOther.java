import java.util.Scanner;

public class SubstringOfOther {
    public static int issubstring(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        for (int i = 0; i <= slen - tlen; i++) {
            if (s.charAt(i) == t.charAt(0)) {
                String substr = s.substring(i, i + tlen);
                if (substr.equals(t)) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string S: ");
        String s = sc.nextLine();
        System.out.print("Enter string T: ");
        String t = sc.nextLine();
        System.out.println(issubstring(s, t));
    }
}
