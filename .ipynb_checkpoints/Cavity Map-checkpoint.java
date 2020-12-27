import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String grid[]=new String[l];
        grid[0]=sc.nextLine();
        for(int i=0;i<l;i++)
        {
            grid[i]=sc.nextLine();
        }
        char ar[][]=new char[l][l];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                ar[i][j]=grid[i].charAt(j);
            }
        }
        for(int i=1;i<l-1;i++)
        {
            for(int j=1;j<l-1;j++)
            {
                char x=ar[i][j];
                if(x>ar[i+1][j] && x>ar[i][j+1] && x>ar[i-1][j] && x>ar[i][j-1])
                {
                    ar[i][j]='X';
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
            System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}