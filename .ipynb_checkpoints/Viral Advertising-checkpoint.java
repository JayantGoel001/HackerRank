import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fv=5;
        int sum=2;
        for(int i=2;i<=n;i++)
        {
            if(i==2)
            {
                fv=(int)Math.floor(5.0/2.0);
            }
            else
            {
                fv=(int)Math.floor(fv*3.0/2.0);
            }
            
            sum=sum+(int)Math.floor(fv*3/2);
        }
        System.out.println(sum);
    }
}
