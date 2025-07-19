package StackAndQueue.StackConversions;

import java.util.Scanner;
import java.util.Stack;

public class Prefixtopostfix {
    public static String Prefixtopostfix(String str){
        Stack s=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else{
                String op2=(String)s.pop();
                String op1=(String)s.pop();
                String subexp=op2+op1+c;
                s.push(subexp);
            }
        }
        return (String )s.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String=");
        String str=sc.nextLine();
        String result=Prefixtopostfix(str);
        System.out.println(result);
    }
    
}
