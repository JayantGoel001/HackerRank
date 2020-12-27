import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> l=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        //System.out.println(l);
        n=sc.nextInt();
        //System.out.println(n);
        
        for(int i=0;i<n;i++)
        {
            String str=sc.nextLine();
            str=sc.nextLine();
            //System.out.println(str);
            if(str.equalsIgnoreCase("Insert")==true)
            {
                int x,y;
                x=sc.nextInt();
                y=sc.nextInt();
                //System.out.println(x+" "+y);
                l.add(x,y);
            }
            else if(str.equalsIgnoreCase("Delete")==true)
            {
                int z=sc.nextInt();
                //System.out.println("z="+z);
                l.remove(z);
            }
        }
            Iterator<Integer> itr=l.iterator();
            while(itr.hasNext())
            {
                int x=(Integer)itr.next();
                System.out.print(x+" ");
            }
    }
}

