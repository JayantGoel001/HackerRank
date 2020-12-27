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
        int x=factorial(n);
        System.out.println(x);
    }
    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }

    }
}
