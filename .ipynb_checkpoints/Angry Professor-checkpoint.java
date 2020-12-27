import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ar[]=new int[n];
            int c=0;
            for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
                if(ar[j]<=0)
                {
                    c++;
                }
            }
            if(c>=k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}