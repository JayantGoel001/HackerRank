import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int len=str.length();
        int c=0;
        int i=0;
        while(i!=len)
        {
            if(Character.isUpperCase(str.charAt(i))==true)
            {
                c++;
            }
            i++;
        }
        System.out.println((c+1));
    }
}
