import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        String str="";
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            int t=n%2;
            str=Integer.toString(t)+str;
            n/=2;
        }
        int maxc=0;
        int max=0;
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='1')
            {
                max++;
            }
            else
            {
                if(max>=maxc)
                {
                    maxc=max;
                    max=0;
                }
                max=0;
            }
        }
        if(max>maxc)
        {
        System.out.println(max);
        }
        else
        {
            System.out.println(maxc);
        }


    }
}
