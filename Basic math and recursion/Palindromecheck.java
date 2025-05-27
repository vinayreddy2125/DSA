class Pcheck
{
    public boolean check(String str,int i,int n)
    {
        if(i>=(n/2))return true;
        if(str.charAt(i)!=str.charAt(n-i-1))return false;
        return check(str,i+1,n);
    }
}
public class Palindromecheck {
    public static void main(String[] args) {
        String str="kitik";
        Pcheck p=new Pcheck();
        boolean res=p.check(str,0,str.length());
        System.out.print(res);

    }
}
