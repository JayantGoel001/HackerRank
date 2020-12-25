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
        int uns=ar[n-1];
        int i=n-2;
        while(i!=-1)
        {
            if(ar[i]>uns&&i!=0)
            {
                ar[i+1]=ar[i];
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
            }
            else if(ar[i]<uns)
            {
             
             ar[i+1]=uns;
            /* if(i==0)
            {
                  ar[0]=uns;
            }*/
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[j]+" ");
            }
            System.out.println();   
                break;
            }
            else if(i==0&&ar[i]>uns)
            {
                ar[i+1]=ar[i];
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
                ar[i]=uns;
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[j]+" ");
            }
            } 
            i--;
        }
    }
}
