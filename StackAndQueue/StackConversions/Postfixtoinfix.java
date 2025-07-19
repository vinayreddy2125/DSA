package StackAndQueue.StackConversions;

import java.util.Scanner;
import java.util.Stack;

public class Postfixtoinfix {
    public static String Postfixtoinfix(String str){
        Stack s=new Stack<>();
        for(char c:str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else{
                String op2=(String)s.pop();
                String op1=(String)s.pop();
                String subexp='('+op1+c+op2+')';
                s.push(subexp);
            }
        }
        return (String )s.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String=");
        String str=sc.nextLine();
        String result=Postfixtoinfix(str);
        System.out.println(result);
    }
    
}
