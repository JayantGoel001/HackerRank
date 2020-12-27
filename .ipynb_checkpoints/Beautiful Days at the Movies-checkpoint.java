import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        for(int a=i;a<=j;a++)
        {
            if((a-reverse(a))%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    public static int reverse(int x)
    {
        int sum=0;
        while(x!=0)
        {
            int t=x%10;
            sum=sum*10+t;
            x/=10;
        }
        return sum;
    }
}