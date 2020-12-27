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
        int p=0,y=0;
        for(int i=0;i<n;i++)
        {
            int x=i+1;
            for(int j=0;j<n;j++)
            {
                if(x==ar[j])
                {
                    p=j+1;
                    break;
                }
            }
            for(int j=0;j<n;j++)
            {
                if(p==ar[j])
                {
                    y=j+1;
                    break;
                }
            }
            System.out.println(y);
        }
    }
}