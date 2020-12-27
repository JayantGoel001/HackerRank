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
        String str=sc.nextLine();
        String mstr="hackerrank";
        int mlen=mstr.length();
        for(int i=1;i<=n;i++)
        {
            str=sc.nextLine();
            int len=str.length();
            int k=0;
            int c=0;
            int sum=0;
            for(int j=0;j<mlen;j++)
            {
                c=0;
                char x=mstr.charAt(j);
                while(k!=len)
                {
                    char y=str.charAt(k);
                    if(x==y)
                    {
                        c++;
                        k++;
                        break;
                    }
                    k++;
                }
                sum=sum+c;
                if(c==0)
                {
                    System.out.println("NO");
                    break;
                }
            }
            if(sum==mlen)
            {
                 System.out.println("YES");
            }
        }
    }
}