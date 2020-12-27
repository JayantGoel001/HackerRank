import java.io.*;
import java.lang.*;
import java.util.*;

class pattern
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            for(int j=x-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}