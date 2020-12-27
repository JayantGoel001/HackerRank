import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BigInteger n=new BigInteger(sc.nextLine());
        if(n.isProbablePrime(2)==true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
