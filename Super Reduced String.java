import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String s=str;
        for(int i=0;i<len;i++)
        {
            s=obj.reduce(s);
            //System.out.println("str="+str+"s="+s);
            /*if(s.equals(str)==true)
            {
                break;
            }*/
        }
        if(s.length()==0)
        {
            System.out.println("Empty String");
        }
        else if(s.length()==len)
        {
            System.out.println("non-reducible string");
        }
        else
        {
            //
            System.out.println(s);
        }
    }
    public static String reduce(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        int len=sb.length();
        for(int i=0;i<len-1;i++)
        {
            char x=sb.charAt(i);
            int j=i+1;
            if(sb.charAt(j)==x)
            {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
            }
            len=sb.length();
        }
        String s=sb.toString();
        return s;
    }
}
