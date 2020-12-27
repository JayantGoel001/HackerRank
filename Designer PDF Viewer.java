import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int ar[]=new int[26];
        int max=0;
        int pos=-1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<26;i++)
        {
            ar[i]=sc.nextInt();
        }
        String str;
        str=sc.nextLine();
        str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            int x=str.charAt(i);
            if(max<ar[x-97])
            {
                max=ar[x-97];
            }
        }
        System.out.println((max*len));
    }
}
