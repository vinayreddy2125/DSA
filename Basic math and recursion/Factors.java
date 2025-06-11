import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number=");
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                al.add(i);
                if(n/i!=i)
                al.add(n/i);
            }
        }
        Collections.sort(al);for(int i:al)System.out.print(i+" ");
        sc.close();
    }
    
}
