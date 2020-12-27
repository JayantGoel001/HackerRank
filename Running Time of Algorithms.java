import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            int uns=ar[i];
            int j=i-1;
            while(j!=-1&&ar[j]>uns)
            {
                ar[j+1]=ar[j];
                j--;
                c++;
            }
            ar[j+1]=uns;
        }
        System.out.println(c);
    }
}
