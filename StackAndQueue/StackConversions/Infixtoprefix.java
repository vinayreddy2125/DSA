package StackAndQueue.StackConversions;

import java.util.Scanner;
import java.util.Stack;

public class Infixtoprefix {
    public static String reverse(String str){
            StringBuilder sb=new StringBuilder(str).reverse();
            return sb.toString();
        }
        public static String modify(String str){
            StringBuilder sb=new StringBuilder();
            for(char c:str.toCharArray()){
                if(c=='('){
                    sb.append(')');
                }
                else if(c==')'){
                    sb.append('(');
                }
                else
                {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    public static int  precedence(char op){
            if(op=='^')return 3;
            else if(op=='*' || op=='/')
            return 2;
            else if(op=='+'|| op=='-')return 1;
            else
            return 0;
        }
        public static String Infixtopostfix(String str){
        StringBuilder sb=new StringBuilder();
        Stack s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append((c));
            }
            else if(c=='(')
            {
                s.push(c);
            }
            else if(c==')'){
                while(!s.isEmpty() && (char)s.peek()!='('){
                    sb.append(s.pop());
                }
                s.pop();
            }
            else
            {
                while(!s.isEmpty()&& precedence(c)<=precedence((char)s.peek())){
                    sb.append(s.pop());
                }
                s.push(c);
            }
        }
        while(!s.isEmpty()){
            if((char)s.peek()=='(')
                return "Invalid expression";
            sb.append(s.pop());
        }
        return sb.toString();
        }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String=");
        String str=sc.nextLine();
        String revstr=reverse(str);
        String modifiedstr=modify(revstr);
        String finalreverse=Infixtopostfix(modifiedstr);
        String result=reverse(finalreverse);
        System.out.println(result);
        sc.close();
    }
    
}
