import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int n,m,s;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            s=sc.nextInt();
            if(n>=m)
            {
                if(m+s-1==n)
                   System.out.println(m+s-1);
                else
                   System.out.println((m+s-1)%n);

            }
            else if(n<m)
            {
                if((m%n+s-1)!=n&&(m%n+s-1)!=0)
                {
                System.out.println((m%n+s-1)%n);
                }
                else if((m%n+s-1)!=n&&(m%n+s-1)==0)
                {
                    System.out.println(n+s-1);
                }
                else
                   System.out.println(m%n+s-1);
            }
            /*else
            {
                System.out.println(m+s-1);
            }*/
        }
    }
}
