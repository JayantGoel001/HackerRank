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
        String str=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            str=sc.nextLine();
            int len=str.length();
            int x=len-1;
            int ar[]=new int[x];
            for(int j=0;j<x;j++)
            {
                ar[j]=Math.abs((int)(str.charAt(j)-str.charAt(j+1)));
            }
            int c=0;
            for(int j=0;j<x/2;j++)
            {
                if(ar[j]==ar[x-j-1])
                {
                    c++;
                }
            }
            if(c==x/2)
            {
                System.out.println("Funny");
            }
            else
            {
                System.out.println("Not Funny");
            }
        }
    }
}