import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n;
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int j=0;j<n1;j++)
        {
        c=0;
        n=sc.nextInt();
        if(n==1)
        {
            System.out.println("Not prime");
            continue;
        }
        if(n==2)
        {
            System.out.println("Prime");
            continue;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
        }
    }
}



