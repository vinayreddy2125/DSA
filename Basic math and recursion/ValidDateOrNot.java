import java.util.Scanner;

public class ValidDateOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dd=sc.nextInt();
        int mm=sc.nextInt();
        int yy=sc.nextInt();
        if(yy>=1800 && yy<=2200)
        {
            if(mm==1 || mm==3 || mm== 5 || mm==7 || mm==8 || mm==10 || mm==12)
            {
                if(dd>=1 &&dd<=31)
                    System.out.println("Valid");
                else
                    System.out.println("Invalid");
            }
            else if(mm==4 ||mm==6 || mm==9 || mm==11)
            {
                if(dd>=1 && dd<=30)
                    System.out.println("Valid");
                else
                    System.out.println("Invalid");
            }
            else if (mm==2)
            {
                if(((yy%4==0 && yy%100!=0)|| yy%400==0)&&(dd==29))
                    System.out.println("Valid");
                else if (dd>=1 && dd<=28)
                    System.out.println("Valid");
                else
                    System.out.println("Invalid");
            }
            else
                    System.out.println("Invalid");
        }
        else
                    System.out.println("Invalid");
    }
    
}
