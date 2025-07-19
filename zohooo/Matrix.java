import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of rows=");
        System.out.print("Enter size of cols=");
        int n=sc.nextInt();
        int m=sc.nextInt();
        char arr[][]=new char[n][m];
        int left=0,top=0;
        int bottom=n-1,right=m-1;
        for(int i=0;i<n;i++){
            String str=sc.next();
            for(int j=0;j<m;j++){
               char[] str1= str.toCharArray();
                arr[i][j]=str1[i];
            }
        }
        StringBuffer res=new StringBuffer();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==arr[j][i]){
                    res.append(arr[i][j]);
                }
            }
        }
    }
}
