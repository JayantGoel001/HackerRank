import java.io.*;
import java.lang.*;
import java.util.*;
class Roundoff
{
    public static void main(String args[])throws IOException
    {
        int z=0;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            if(arr[i]>37)
            {
                for(int j=arr[i];j<=(arr[i]+5);j++)
                {
                    if(j%5==0)
                    {
                        z=j;
                    }
                }
                if(z-arr[i]<3)
                {
                    arr[i]=z;
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            System.out.println(arr[i]);
        }
    }
}