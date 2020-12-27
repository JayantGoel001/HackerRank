import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        String  str;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        str=sc.nextLine();
        for(int j=0;j<n;j++)
        {
            str=sc.nextLine();
        int len=str.length();
        int sum=0;
        for(int i=0;i<len/2;i++)
        {
            sum+=Math.abs((int)str.charAt(i)-(int)str.charAt(len-1-i));
        }
        System.out.println(sum);
        }
    }
}