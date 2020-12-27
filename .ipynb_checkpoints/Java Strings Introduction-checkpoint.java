import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len1=A.length();
        int len2=B.length();
        int sum=len1+len2;
        System.out.println(sum);
        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.print(Character.toUpperCase(A.charAt(0)));
        System.out.print(A.substring(1,len1)+" ");
        System.out.print(Character.toUpperCase(B.charAt(0)));
        System.out.print(B.substring(1,len2));
    }
}