import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String,Integer> x=new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            x.put(name,phone);
		}

		while(in.hasNext())
		{
			String s=in.nextLine();
            if(x.get(s)!=null)
            {
                System.out.println(s+"="+x.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
		}
	}
}



