import java.util.Scanner;

public class Lena {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        if(t.length()>s.length())System.out.println("no valid string");
        else{
        char start=t.charAt(0);
        char end=t.charAt(t.length()-1);
        StringBuffer res=new StringBuffer(s);
        int st = 0,en=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            else if(s.charAt(i)==start){
                st=i;break;
            }
        } 
        int x=st;
        for(int i=st;i<s.length();i++){
            if(s.charAt(i)==end){
                en=i;
                break;
            }
        }
        String res1=s.substring(st,en+1);
        System.out.print(res1);
        }
        
    }
    
}
