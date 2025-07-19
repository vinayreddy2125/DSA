package StackAndQueue.StackConversions;

import java.util.Scanner;
import java.util.Stack;

public class PrefixtoInfix {
    public static String prefixtoinfix(String str){
        Stack s=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else{
                String op2=(String)s.pop();
                String op1=(String)s.pop();
                String subexp='('+op2+c+op1+')';
                s.push(subexp);
            }
        }
        return (String )s.peek();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String=");
        String str=sc.nextLine();
        String result=prefixtoinfix(str);
        System.out.println(result);
    }
}
