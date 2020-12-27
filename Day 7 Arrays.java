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
            ar[n-i-1]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
