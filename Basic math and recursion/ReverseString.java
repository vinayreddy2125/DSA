public class ReverseString {
    public static void reverse(char c[],int start,int end)
    {
        while(start<end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;end--;
        }
        System.out.println("Reverse String="+new String(c));
    }
    public static void main(String[] args) {
        String s=new String("vinay");
        // StringBuilder str=new StringBuilder(s);
        // str.reverse();
        // System.out.println(str);
        char c[]=s.toCharArray();
        reverse(c,0,c.length-1);
    }
}

