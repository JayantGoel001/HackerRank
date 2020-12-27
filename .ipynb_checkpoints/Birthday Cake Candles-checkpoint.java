import java.io.*;
import java.lang.*;
import java.util.*;
class candles
{
    public static void main(String args[])throws IOException
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ar[]=new int[x];
        for(int i=0;i<x;i++)
        {
            ar[i]=sc.nextInt();
        }
        int max=ar[0];
        for(int i=0;i<x;i++)
        {
            if(max<=ar[i])
            {
                max=ar[i];
            }
        }
        for(int i=0;i<x;i++)
        {
            if(max==ar[i])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}