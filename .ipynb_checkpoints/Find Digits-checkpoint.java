import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int c=0;
            int num=x;
            while(x!=0)
            {
                t=x%10;
                if(t!=0&&num%t==0)
                {
                    c++;
                }
                x/=10;
            }
            System.out.println(c);
        }
    }
}
