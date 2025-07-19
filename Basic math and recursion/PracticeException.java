import java.util.*;
class negativenumber extends Exception{
    public String toString(){
        return "Number must be greater than zero";
    }
}
public class PracticeException{
    public static void main(String[] args) throws negativenumber {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try {
            if(a<0){
                throw new negativenumber();
            }
        } /*catch (Exception e) {
            e.printStackTrace();
        }*/
        finally{
            System.out.println("finally block executed");
            sc.close();
        }
    }
}