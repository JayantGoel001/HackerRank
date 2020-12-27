import java.io.*;
import java.lang.*;
import java.util.*;
class plus_minus
{
    public static void main(String args[])throws IOException
    {
        int pos,neg,zero;
        pos=0;
        neg=0;
        zero=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]>0)
            {
                pos++;
            }
            else if(arr[i]<0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }
        float x=(float)pos/a;
        float y=(float)neg/a;
        float z=(float)zero/a;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        
    }
}