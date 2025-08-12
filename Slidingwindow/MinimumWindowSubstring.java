
package Slidingwindow;
import java.util.*;
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String S=");
        String s=sc.next();

        System.out.print("Enter String T=");
        String t=sc.next();
        int n=s.length();
        int m=t.length();
        int l=0,r=0,count=0,minlen=Integer.MAX_VALUE,sIndex=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        while(r<n){
            char rightchar=s.charAt(r);
            if(map.getOrDefault(rightchar,0)>0)count++;
            map.put(rightchar,map.getOrDefault(rightchar,0)-1);
            while(count==m){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sIndex=l;
                }
                char leftchar=s.charAt(l);
                map.put(leftchar,map.getOrDefault(leftchar,0)+1);
                if(map.get(leftchar)>0)count--;
                l++;
            }
            r++;
        }
        System.out.println(sIndex==-1?"":s.substring(sIndex,sIndex+minlen));

        sc.close();
    }
    
}
