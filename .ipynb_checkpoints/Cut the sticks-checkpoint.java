import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int zero=0;
        System.out.println(n);
        while(zero!=n)
        {
            zero=0;
            int c=0;
            int small=999999999;
            for(int i=0;i<n;i++)
            {
                if(ar[i]<=0)
                {
                    continue;
                }
                else if(small>ar[i])
                {
                    small=ar[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                ar[i]-=small;
               if(ar[i]>0)
                {
                    c++;
                }
                else
                {
                    zero++;
                }
            }
            if(c!=0)
            System.out.println(c);

        }
    }
}
