import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        String str;
        str=sc.nextLine();
        str=sc.nextLine();
        int k=sc.nextInt();
        k=k%26;
        String reds="";
        for(int i=0;i<len;i++)
        {
            char x=str.charAt(i);
            if(Character.isLetter(x)==true)
            {
                if(Character.isUpperCase(x)==true)
                {
                    x+=k;
                    if(x>90)
                    {
                        x-=26;
                    }
                }
                else if(Character.isLowerCase(x)==true)
                {
                    x+=k;
                    if(x>122)
                    {
                        x-=26;
                    }
                }
                
                reds=reds+x;
            }
            else
            {
                reds=reds+x;
            }
        }
        System.out.println(reds);
    }
}
