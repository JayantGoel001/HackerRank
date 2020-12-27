import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str,reds;
        str=sc.nextLine();
        int len=str.length();
        int c=0;
        for(int i=0;i<len;i+=3)
        {
            reds=str.substring(i,i+3);
            if(reds.equals("SOS")!=true)
            {
                if(reds.charAt(0)!='S')
                {
                    c++;
                }
                if(reds.charAt(1)!='O')
                {
                    c++;
                }
                if(reds.charAt(2)!='S')
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
