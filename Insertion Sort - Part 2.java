import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            /*if(i==0)
            {
                obj.print(ar,n);
            }*/
            int uns=ar[i];
            int j=i-1;
            while(j!=-1)
            {
               if(ar[j]>uns)             
                {
                    ar[j+1]=ar[j];
                    ar[j]=uns;
                }
                else
                {
                    ar[j+1]=uns;
                    break;
                }
                 j--;
            }
             obj.print(ar,n);
        }
    }
    public static void print(int ar[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
