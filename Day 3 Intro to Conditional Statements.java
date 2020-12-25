import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==1)
        {
            System.out.println("Weird");
        }
        else
        {
            if((n>=2&&n<=5)||(n>20))
            {
                System.out.println("Not Weird");
            }
            else
            {
                System.out.println("Weird");
            }

        }
    }
}
