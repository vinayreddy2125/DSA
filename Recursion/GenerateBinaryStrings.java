package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.err.println("enter value of n=");
        int n=sc.nextInt();
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<(int)Math.pow(2,n);i++){
            StringBuilder currentstr=new StringBuilder(Integer.toBinaryString(i));
            while(currentstr.length()<n){
                currentstr.insert(0,'0');
            }
            System.out.println(currentstr);
            int f=1;int j=0;
            while(j<currentstr.length()-1){
                if(currentstr.charAt(j)=='1' && currentstr.charAt(j+1)=='1'){
                    f=0;
                }
                j++;
            }
            if(f==1){
                    res.add(currentstr.toString());
                }
        }
        System.out.println(res);
    }
    
}
