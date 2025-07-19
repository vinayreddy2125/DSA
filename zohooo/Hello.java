import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter n=");
        String str="vinay";
        StringBuilder str1=new StringBuilder(str);
        str1.deleteCharAt(3);
        System.out.println(str1);
		int n=sc.nextInt();
		System.out.print(n);
		sc.close();
    }
}