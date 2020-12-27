import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    static int top=-1;
    static char stack[]=new char[1000000];
    public static void push(char x)
    {
        if(top==999999)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            top++;
            stack[top]=x;
        }
    }
    public static char pop()
    {
        if(top==-1)
        {
            return '\u0000';
        }
        else
        {
            return stack[top--];

        }
    }
    public static void main(String args[])throws IOException
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        //n=sc.nextInt();
        String str;//=sc.nextLine();
        while(sc.hasNextLine())
        {
            int c=0;
            str=sc.nextLine();
            int len=str.length();
            for(int j=0;j<len;j++)
            {
                char x=str.charAt(j);
                if(x=='('||x=='{'||x=='[')
                {
                    obj.push(x);
                }
                else
                {
                    char z=obj.pop();
                    if(z=='('&&x==')')
                    {
                        c++;
                    }
                    else if(z=='['&&x==']')
                    {
                        c++;
                    }
                    else if(z=='{'&&x=='}')
                    {
                        c++;
                    }
                    else
                    {
                        c=0;
                        break;
                    }
                }
                
            }
                if(c==0)
                {
                    System.out.println("false");
                }
                else if(top==-1)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
                top=-1;
        }
    }
}
