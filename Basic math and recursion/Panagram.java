import java.util.Scanner;

public class Panagram {
    public static boolean ispanagram(int freq[]){
        for(int count:freq){
            if(count==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  string: ");
        String s = sc.nextLine().toLowerCase();
        int freq[]=new int[26];
        for(char c: s.toCharArray()){
            if(c>='a' &&c<='z')
            freq[c -'a']++;
        }
        if(ispanagram(freq)){
            System.out.println("true");
        }
        else
        System.out.println("false");
    }
    
}
