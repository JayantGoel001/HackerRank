import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        try
        {
            int x,y;
            x=sc.nextShort();
            y=sc.nextShort();
            int did=x/y;
            System.out.println(did);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

