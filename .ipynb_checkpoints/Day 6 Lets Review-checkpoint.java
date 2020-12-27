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
        String str[]=new String[n];
        str[0]=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
        }
        int len[]=new int[n];
        for(int i=0;i<n;i++)
        {
            len[i]=str[i].length();
        }
        for(int j=0;j<n;j++)
        {
        for(int i=0;i<len[j];i++)
        {
            if(i%2==0)
            {
                System.out.print(str[j].charAt(i));
            }
        }
        System.out.print(" ");
        for(int i=0;i<len[j];i++)
        {
            if(i%2==1)
            {
                System.out.print(str[j].charAt(i));
            }
        }
        System.out.println();
        }

    }
}