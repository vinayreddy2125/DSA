package Slidingwindow;

import java.util.Scanner;

public class SubarrayAllthreeChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String = ");
        String str= sc.next();

        int count=0,n=str.length();
        for (int i = 0; i < n; i++) {
            int hash[]=new int[3];
            for (int j = i; j < n; j++) { 
                hash[str.charAt(j)-'a']++;
                if(hash[0]>0 && hash[1]>0 &&hash[2]>0)count++;
            }
        }
        System.out.println(count);
    }
    
}
