import java.io.*;
import java.lang.*;
import java.util.*;
class min_max
{
    public static void main(String args[])throws IOException
    {
        long arr[]=new long[5];
        long sum;
        sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextLong();
        }
        
        long max=arr[0];
        long min=arr[0];
        
        for(int i=0;i<5;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
            sum=sum+arr[i];
        }
        long minsum=sum-max;
        long maxsum=sum-min;
        System.out.println(minsum+" "+maxsum);
    }
}