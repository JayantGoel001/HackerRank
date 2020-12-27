import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int n,k,q;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        q=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[(i+k)%n]=sc.nextInt();
        }
        int m[]=new int[q];
        for(int i=0;i<q;i++)
        {
            m[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++)
        {
            System.out.println(ar[m[i]]);
        }
    }
}
