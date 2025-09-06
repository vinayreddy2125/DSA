package Dynamicprogramming;
import java.util.*;

public class Fibonacci {
    //------space optimization of tabulation------
    public static void main(String[] args) {
        //recursive
        int n=2;
        int prev2=0,prev=1;
        for(int i=2;i<=n;i++){
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
/*
-------recursive-----
 public static int fib(int n){
        if(n<=1)return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        //recursive
        int n=6;
        System.out.println(fib(n));
    }
 */
/*
 --------memoization---------
 public static int fib(int n,int[] dp){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
    public static void main(String[] args) {
        //recursive
        int n=6;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));
    }
 */

 /*

 ---------tabulation-----
public class Fibonacci {

    public static void main(String[] args) {
        //recursive
        int n=6;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
  */
