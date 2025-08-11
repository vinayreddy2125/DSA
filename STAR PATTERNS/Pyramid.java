import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter input=");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i || j==n-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
/*int count = 0;

        for (int i = 1; i <= n; i++) {
            count += i;
            if (i % 2 == 1) {
                // odd row - ascending
                int val = count - i + 1; // start value for this row
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j % 2 == 1) {
                        System.out.print(val);
                        val++;
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                // even row - descending
                int val = count;
                for (int j = 2 * i - 1; j >= 1; j--) {
                    if (j % 2 == 1) {
                        System.out.print(val);
                        val--;
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }*/
