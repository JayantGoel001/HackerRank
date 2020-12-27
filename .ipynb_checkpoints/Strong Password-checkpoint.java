import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
{
    public static void main(String args[])throws IOException
    {
        Solution obj=new Solution();
        String str;
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        str=sc.nextLine();
        str=sc.nextLine();
        int not=0;
        String lw="abcdefghijklmnopqrstuvwxyz";
        String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        if((len<6)&&(obj.lowercase(str)==true)&&(obj.uppercase(str)==true)&&(obj.special(str)==true)&&(obj.digits(str)==true))
        {
            not=6-len;
        }
        else if(len>=6)
        {
            if(obj.lowercase(str)==false)
            {
                not++;
            }
            if(obj.uppercase(str)==false)
            {
                not++;
            }
            if(obj.special(str)==false)
            {
                not++;
            }
            if(obj.digits(str)==false)
            {
                not++;
            }
        }
        else
        {
            int max=6-len;
            if(obj.lowercase(str)==false)
            {
                not++;
            }
            if(obj.uppercase(str)==false)
            {
                not++;
            }
            if(obj.special(str)==false)
            {
                not++;
            }
            if(obj.digits(str)==false)
            {
                not++;
            }
            if(not<max)
            {
                not=max;
            }
        }
        System.out.println(not);
    }
    public static Boolean lowercase(String str)
    {
        int len=str.length();
        int i=0;
        while(i!=len)
        {
            char x=str.charAt(i);
            if(Character.isLowerCase(x)==true)
            {
                return true;
            }
            i++;
        }
        return false;
    }
    public static Boolean uppercase(String str)
    {
        int len=str.length();
        int i=0;
        while(i!=len)
        {
            char x=str.charAt(i);
            if(Character.isUpperCase(x)==true)
            {
                return true;
            }
            i++;
        }
        return false;
    }
    public static Boolean digits(String str)
    {
        int len=str.length();
        int i=0;
        while(i!=len)
        {
            char x=str.charAt(i);
            if(Character.isDigit(x)==true)
            {
                return true;
            }
            i++;
        }
        return false;
    }
    public static Boolean special(String str)
    {
        int len=str.length();
        int i=0;
        String sp="!@#$%^&*()-+";
        int slen=sp.length();
        while(i!=len)
        {
            char x=str.charAt(i);
            for(int j=0;j<slen;j++)
            {
                if(x==sp.charAt(j))
                {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
