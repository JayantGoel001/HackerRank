import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int c=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                int sum=0;
                int k=0;
                while(k!=i)
                {
                    sum=sum+ar[j+k];
                    k++;
                }
                if(sum<0)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}