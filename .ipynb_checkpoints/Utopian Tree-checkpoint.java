import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int x=0;
            for(int j=0;j<=ar[i];j++)
            {
            if(j%2==0)
            {
                x++;
            }
            else
            {
                x=x*2;
            }
            }
            ans[i]=x;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
