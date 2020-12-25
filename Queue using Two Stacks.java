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
        //    /*if(ar[i]==1)
        //    {
        //        if(st1.empty()==true && st2.empty()==true)
        //        {
        //             st1.push(value[i]);
        //         }
        //         else if(st1.empty()==true && st2.empty()==false)
        //         {
        //             while(st2.empty()==false)
        //             {
        //                 st1.push(st2.pop());
        //             }
        //             st1.push(value[i]);
        //         }
        //         else if(st1.empty()==false)
        //         {
        //             st1.push(value[i]);
        //         }
        //    }*/
        //    if(ar[i]==2)
        //    {
        //        if(st1.empty()==true && st2.empty()==true)
        //        {
        //            System.out.println("ERRor Stack OvErFloW");
        //        }
        //        else if(st1.empty()==false && st2.empty()==true)
        //        {
        //            while(st1.empty()==false)
        //             {
        //                 st2.push(st1.pop());
        //             }
        //             st2.pop();
        //        }
        //        else if(st1.empty()==true && st2.empty()==false)
        //        {
        //            st2.pop();
        //        }
        //    }
        //    else if(ar[i]==3)
        //    {
        //        if(st1.empty()==false)
        //        {
        //            while(st1.empty()==false)
        //             {
        //                 st2.push(st1.pop());
        //             }
        //             System.out.println(st2.peek());
        //        }
        //        else if(st2.empty()==false)
        //        {
        //            System.out.println(st2.peek());
        //        }
        //    }
       }
    }
}

