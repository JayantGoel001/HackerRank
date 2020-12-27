import java.io.*;
import java.lang.*;
import java.util.*;
class diagonal
{
    public static void main(String args[])
    {
        int rd,ld;
        rd=0;ld=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(i+j==a-1)
                {
                    ld=ld+arr[i][j];
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            rd=rd+arr[i][i];
        }
        int diff=Math.abs(ld-rd);
        System.out.println(diff);
    }
}