import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int ar[][]=new int[6][6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        int sum=-999999999;
        int maxsum=-999999999;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum=ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
