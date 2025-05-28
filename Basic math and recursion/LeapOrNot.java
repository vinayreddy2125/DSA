import java.util.Scanner;

public class LeapOrNot
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter year=");
        int yy=sc.nextInt();
        if((yy%4==0 && yy%100!=0)|| yy%400==0)
        System.out.println("LeapYear");
        else 
        System.out.println("Not LeapYear");

        
    }
}