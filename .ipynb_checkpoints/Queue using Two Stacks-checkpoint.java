import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ar[]=new int[n];
       int value[]=new int[n];
       Stack<Integer> st1=new Stack<Integer>();
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]==1)
           {
               value[i]=sc.nextInt();
               st1.push(value[i]);
           }
       }
       Stack<Integer> st2=new Stack<Integer>();
       for(int i=value.length-1;i>=0;i--)
       {
           if(ar[i]==1)
           {
               st2.push(value[i]);
           }
       }
       for(int i=0;i<n;i++)
       {
           if(ar[i]==2)
           {
               st2.pop();
           }
           else if(ar[i]==3)
           {
               System.out.println(st2.peek());
           }
       }
    }
}

