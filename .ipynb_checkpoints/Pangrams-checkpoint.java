import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        String mstr="qwertyuiopkjhgfdsazxcvbnml";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int p=1;
        for(int i=0;i<26;i++)
        {
            char x=mstr.charAt(i);
            int c=0;
            for(int j=0;j<str.length();j++)
            {
                if(x==str.charAt(j))
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("not pangram");
                p=0;
                break;
            }
        }
        if(p!=0)
        {
            System.out.println("pangram");
        }
    }
}