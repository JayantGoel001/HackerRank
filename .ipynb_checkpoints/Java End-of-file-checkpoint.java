import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        String str="";
        Scanner sc=new Scanner(System.in);
        int i=1;
        try
        {
            while(str.endsWith("end-of-file.")!=true)
            {
                str=sc.nextLine();
                System.out.println(i+" "+str);
                i++;
            }
        }
        catch(NoSuchElementException e)
        {

        }
    }
}
