import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int n,k,t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int ad=0;ad<t;ad++)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=i+1;
            }
            int ar2[]=new int[k];
            for(int i=1;i<=n;i++)
            {
                for(int j=i+1;j<=n;j++)
                {
                    int x=i&j;
                    if(x<k)
                    {
                        ar2[x]++;
                    }
                }
            }
            int num=0;
            for(int i=0;i<k;i++)
            {
                if(ar2[i]!=0)
                {
                    num=i;
                }
            }
            System.out.println(num);
        }
    }
}
