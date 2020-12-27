import java.io.*;
import java.lang.*;
import java.util.*;
class time
{
    public static void main(String args[])throws IOException
    {
        String str2,hrs,min,sec,x;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str2=str.substring(8,10);
        hrs=str.substring(0,2);
        min=str.substring(3,5);
        sec=str.substring(6,8);
        int hr=Integer.valueOf(hrs);
         if(hr!=12 )
         {
        if(str2.compareToIgnoreCase("PM")==0)
        {
            hr=hr+12;
            System.out.println(hr+":"+min+":"+sec);
        }
             else
             {
             System.out.println(hrs+":"+min+":"+sec);
             }
        }
        else
        {
            if(str2.compareToIgnoreCase("PM")==0)
            {
                 x="12";
            }
            else
            {
                 x="00";
            }
            System.out.println(x+":"+min+":"+sec);
        }
        
        }
    }