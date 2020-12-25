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
    /*public static Boolean isProbablePrime(BigInteger a)
    {
        int c=0;
        BigInteger i=new BigInteger("2");
        for(;i.compareTo(a)<0;i=i.add("1"))
        {
            if(a.remainder(i)==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return true;
        }
        return false;
    }*/
}
