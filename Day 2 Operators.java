import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static void main(String args[])throws IOException
    {
        double cost;
        Scanner sc=new Scanner(System.in);
        cost=sc.nextDouble();
        int tip=sc.nextInt();
        int tax=sc.nextInt();
        double tot=cost*(100+tip+tax)/100.0;
        System.out.println((int)Math.rint(tot));
    }
}
