import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int b,n,m;
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        n=sc.nextInt();
        m=sc.nextInt();
        int arn[]=new int[n];
        int arm[]=new int[m];
        int smalln=9999999;
        int smallm=9999999;
        for(int i=0;i<n;i++)
        {
            arn[i]=sc.nextInt();
            if(arn[i]<smalln)
            {
                smalln=arn[i];
            }
        }
        for(int i=0;i<m;i++)
        {
            arm[i]=sc.nextInt();
            if(arm[i]<smallm)
            {
                smallm=arm[i];
            }
        }
        int s=smallm+smalln;
        //System.out.println(" vv"+s);
        for(int i=b;i>=s;i--)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<m;k++)
                {
                    if(i==arn[j]+arm[k])
                    {
                        System.out.println(i);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("-1");
    }
}
