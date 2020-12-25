import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        try
        {
            int n=Integer.parseInt(str);
            System.out.println(n);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Bad String");
        }

    }
}
