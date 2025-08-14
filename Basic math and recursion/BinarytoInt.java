import java.util.Scanner;

public class BinarytoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BinaryString= ");
        String  str= sc.next();
        int sum=0,n=str.length()-1;int i=0;
        while(n>=0){
            int curr=str.charAt(n)-'0';
            if(curr==1){sum=sum+(int)Math.pow(2, i);}
            i++;
            n--;
        }
        System.out.println("Decimal value="+sum);
    }
    
}
