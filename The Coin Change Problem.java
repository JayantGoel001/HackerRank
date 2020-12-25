import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int cost,n;
        cost=sc.nextInt();
        n=sc.nextInt();
        int coin[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            coin[i]=sc.nextInt();
        }
        System.out.println(NCoinWay(coin,n,cost));


    }
    public static long NCoinWay(int coin[],int n,int cost)
    {
        long ar[][]=new long[n+1][cost+1];
        for(int j=0;j<cost+1;j++)
        {
            ar[0][j]=0l;
        }
        for(int i=0;i<n+1;i++)
        {
            ar[i][0]=1l;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=cost;j++)
            {
                if(coin[i-1]>j)
                {
                    ar[i][j]=(ar[i-1][j]);
                }
                else
                {
                    ar[i][j]=(ar[i-1][j]+ar[i][j-coin[i-1]]);
                }
            }
        }
        return ar[n][cost];
    }
}
