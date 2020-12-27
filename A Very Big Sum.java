import java.io.*;
import java.lang.*;
import java.util.*;
class arrrrr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long ar[]=new long[a];
        long sum;
        sum=0;
        for(int i=0;i<a;i++)
        {
           ar[i]=sc.nextLong();
        }
        for(int i=0;i<a;i++)
        {
            sum+=ar[i];
        }
        System.out.println(sum);
    }
}