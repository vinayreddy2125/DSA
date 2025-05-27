 
public class STARPATTERNS {

  public static void main(String[] args) {
/*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *   
*/
    int n=5;
    for (int i =0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
          System.out.print("* ");
      }
      System.out.println();
    } 

/* 
   * 
   * * 
   * * *
   * * * *
   * * * * *   
*/
  for (int i=0;i<=n;i++)
  {
    for (int j =0;j<i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
  }

/*  1 
    12
    123
    1234
    12345
*/
  for (int i=0;i<=n;i++)
  {
    for (int j =1;j<=i;j++)
    {
        System.out.print(j);
    }
    System.out.println();
  }
/*
    1
    22
    333
    4444
    55555
 */
  for (int i=0;i<=n;i++)
  {
    for (int j =0;j<i;j++)
    {
        System.out.print(i);
    }
    System.out.println();
  }
/*
    * * * * * 
    * * * * 
    * * * 
    * * 
    *
*/
  for(int i=n;i>0;i--)
  {
    for(int j=0;j<i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
  }
/*
    12345
    1234
    123
    12
    1
 */
  for(int i=n;i>0;i--)
  {
    for(int j=1;j<=i;j++)
    {
        System.out.print(j);
    }
    System.out.println();
  }
/*
    *     
   * * *    
  * * * * *   
 * * * * * * *  
* * * * * * * * * 
 */

for (int i = 0; i < n; i++) {
    for (int j = 0; j <=n - i-1; j++) {
        System.out.print(" ");
    }
    for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
    }
    for (int j = 0; j <=n - i-1; j++) {
        System.out.print(" ");
    }
    System.out.println();
}
/*
* * * * * * * * * 
 * * * * * * *  
  * * * * *   
   * * *    
    *  
 */

for (int i = n; i >0 ; i--) {
    for (int j = 0; j <n-i; j++) {
        System.out.print(" ");
    }
    for (int j = 0; j < 2 *i-1; j++) {
        System.out.print("*");
    }
    for (int j = 0; j < n-i; j++) {
        System.out.print(" ");
    }
    System.out.println();
}
/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 */
for(int i=1;i<=2*n-1;i++)
{
    int stars=i;
    if(i>n)stars=2 *n-i;
    for(int j=0;j<stars;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}
/*
    1 
    0 1 
    1 0 1 
    0 1 0 1 
    1 0 1 0 1 
 */
int one=1;
for(int i=0;i<n;i++)
{
    if(i%2==0)one=1;
    else one=0;
    for(int j=0;j<=i;j++)
    {   
        
        if(one==1)
        {
            System.out.print("1 ");
            one=0;
        }
        else
        {
            System.out.print("0 ");
            one=1;
        }
    }
    System.out.println();
}
/*
1        1
12      21
123    321
1234  4321
1234554321
 */
    int spaces=2* (n-1);
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        for(int j=0;j<spaces;j++)
        {
           System.out.print(" "); 
        }
        for(int j=i;j>=1;j--)
        {
            System.out.print(j);
        }
        spaces-=2;
        System.out.println();
    }
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
    int count=1;
    for (int i =0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
          System.out.print(count++ +" ");
      }
      System.out.println();
    } 
/*
A 
A B 
A B C 
A B C D 
A B C D E
*/
    for(int i=0;i<=n;i++)
    {
        char ch='A';
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch +" ");
            ch=(char) ('A'+j);
        }
        System.out.println();
    }
/*
A B C D E 
A B C D 
A B C 
A B 
A
*/
    for(int i=n;i>0;i--)
    {
        char ch='A';
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch +" ");
            ch=(char) ('A'+j);
        }
        System.out.println();
    }
/*
A 
B B 
C C C 
D D D D 
E E E E E
 */
    for(int i=0;i<n;i++)
    {
        char ch='A';
        ch=(char) ('A'+i);
        for(int j=0;j<=i;j++)
        {
            System.out.print(ch +" ");
            
        }
        
        System.out.println();
    }

/*
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA
 */
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        char ch='A';
        for(int j=1;j<=2*i-1;j++)
        {
            System.out.print(ch);
            if(j<i)ch++;
            else ch--;
        }
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }
/*
E 
D E 
C D E 
B C D E 
A B C D E
 */
    for(int i=0;i<n;i++)
    {
        for(char ch=(char)('E'-i);ch<='E';ch++)
        {
            System.out.print(ch +" ");
        }
        System.out.println();
    }
/*
**********
****  ****
***    ***
**      **
*        *
 */
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i;j++)
        {
            System.out.print("*");
        }
        for(int j=0;j<2*i;j++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<n-i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}

