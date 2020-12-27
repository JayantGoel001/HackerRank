import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar[]=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            ar[i]=new ArrayList<Integer>(x);
            for(int j=0;j<x;j++)
            {
                ar[i].add(sc.nextInt());
            }
        }
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            if((x2-1)<ar[x1-1].size())
                System.out.println(ar[x1-1].get(x2-1));
            else
                System.out.println("ERROR!");
        }

    }
}

