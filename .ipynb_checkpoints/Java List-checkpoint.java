import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            String str=sc.nextLine();
            str=sc.nextLine();
            if(str.equalsIgnoreCase("Insert")==true)
            {
                int x,y;
                x=sc.nextInt();
                y=sc.nextInt();
                l.add(x,y);
            }
            else if(str.equalsIgnoreCase("Delete")==true)
            {
                int z=sc.nextInt();
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