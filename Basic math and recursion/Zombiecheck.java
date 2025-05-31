import java.util.Scanner;
//check whether the given input contains only "grr" or "arg" if contains print true else false
class Zombie {
    public boolean checkzombie(String s)
    {
        int n=s.length();
        if(n%3!=0)return false;
        else{
            for(int i=0;i<=n-3;)
            {
                char c1=s.charAt(i);
                char c2=s.charAt(i+1);
                char c3=s.charAt(i+2);
                if(c1=='g' &&c2=='r'&&c3=='r')i+=3;
                else if(c1=='a' &&c2=='r'&&c3=='g')i+=3;
                else return false;
            }
        }
        return true;
    }  
}
public class Zombiecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String=");
        String input=sc.nextLine();
        Zombie h=new Zombie();
        System.out.println(h.checkzombie(input));sc.close();
    }
    
}
