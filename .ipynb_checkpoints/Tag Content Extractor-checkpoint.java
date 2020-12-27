import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
            int c=0;
			String line = in.nextLine();
			Pattern patt=Pattern.compile("<(.+)>([^<>]+)</\\1>");
            Matcher m=patt.matcher(line);
            while(m.find())
            {
                System.out.println(m.group(2));
                c=1;
            }
			if(c==0)
            {
                System.out.println("None");
            }
			testCases--;
		}
	}
}