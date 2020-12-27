import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        int n;
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            if(Math.abs(x-z)>Math.abs(y-z))
            {
                System.out.println("Cat B");
            }   
            else if(Math.abs(x-z)<Math.abs(y-z))
            {
                System.out.println("Cat A");
            }
            else
            {
                System.out.println("Mouse C");
            }
        }
    }
}
