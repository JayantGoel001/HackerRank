import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static int diff(int ar[][],int inp[][])
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum=sum+Math.abs(ar[i][j]-inp[i][j]);
            }
        }
        return sum;
    }
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int r=n/2;
        int c=n-1;
        int ar[][][]=new int[8][n][n];
        ar[0][r][c]=1;
        for(int i=2;i<=n*n;i++)
        {
            if(ar[0][(r+1)%n][(c+1)%n]==0)
            {
                r=(r+1)%n;
                c=(c+1)%n;
            }
            else
            {
                c=(c+n-1)%n;
            }
            ar[0][r][c]=i;
        }
        r=n-1;
        c=n/2;
        ar[1][r][c]=1;
        for(int i=2;i<=n*n;i++)
        {
            if(ar[1][(r+1)%n][(c+1)%n]==0)
            {
                r=(r+1)%n;
                c=(c+1)%n;
            }
            else
            {
                r=(r+n-1)%n;
            }
            ar[1][r][c]=i;
        }
        for(int i=0;i<3;i++)
        {
            ar[2][0][i]=ar[0][2][i];
            ar[2][1][i]=ar[0][1][i];
            ar[2][2][i]=ar[0][0][i];
            ar[3][0][i]=ar[1][2][i];
            ar[3][1][i]=ar[1][1][i];
            ar[3][2][i]=ar[1][0][i];
        }
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    ar[k+4][i][j]=ar[k+2][j][i];
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            ar[6][i][0]=ar[2][i][2];
            ar[6][i][1]=ar[2][i][1];
            ar[6][i][2]=ar[2][i][0];
            ar[7][i][0]=ar[3][i][2];
            ar[7][i][1]=ar[3][i][1];
            ar[7][i][2]=ar[3][i][0];
        }
        int inp[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                inp[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int min=9999999;
        for(int i=0;i<8;i++)
        {
            sum=diff(ar[i],inp);
            if(sum<min)
            {
                min=sum;
            }
        }
        System.out.println(min);
    }
}