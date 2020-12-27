import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        //System.out.println(n);
        String str[]=new String[n];
        String str1[]=new String[n];
        String def="@gmail.com";
        ArrayList<String> al=new ArrayList<String>(n);
        for(int i=0;i<n;i++)
        {
            str1[i]=sc.next();
            str[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            if(str[i].endsWith(def)==true)
            {
                al.add(str1[i]);
            }
        }
        //System.out.println(al);
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
       
    }
}
