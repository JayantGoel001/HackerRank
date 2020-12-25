import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    static int top=-1;
    static int ar[]=new int[1000000];
    public static void main(String[] args)throws IOException
    {
        int ch;
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
               int x=sc.nextInt();
               obj.push(x);
               break;
            case 2:
                obj.pop();
                break;
            case 3:
                obj.maximum();
                break;
            default:
                System.out.println("OOPs Wrong input");
        }
        }
    }
    public static void push(int x)
    {
        if(top==1000000-1)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            top++;
            ar[top]=x;
        }
    }
    public static void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            top--;
        }
    }
    public static void maximum()
    {
        int max=ar[0];
        for(int i=0;i<=top;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println(max);
    }
}

