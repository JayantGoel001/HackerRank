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
        //int x=n/2;
        int ar2[]=new int[n];
        int ar3[]=new int[n];
        int p=0;
        int l=0,k=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            if(i==0)
            {
                p=ar[0];
                continue;
            }
            if(ar[i]>p)
            {
                ar2[k]=ar[i];
                k++;
            }
            else
            {
                ar3[l]=ar[i];
                l++;
            }
        }
        for(int i=0;i<ar3.length;i++)
        {
            if(ar3[i]!=0)
                System.out.print(ar3[i]+" ");
            else
                 break;
        }
        System.out.print(p+" ");
        for(int i=0;i<ar2.length;i++)
        {
            if(ar2[i]!=0)
                  System.out.print(ar2[i]+" ");
            else
                break;
        }

    }
}
