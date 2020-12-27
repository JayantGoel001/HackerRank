import java.io.*;
import java.util.*;
import java.text.*;
import java.math.BigInteger;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        BigInteger a=new BigInteger(sc.nextLine());
        BigInteger b=new BigInteger(sc.nextLine());
        BigInteger add2=a.add(b);
        BigInteger mul=a.multiply(b);
        System.out.println(add2);
        System.out.println(mul);
    }
}

