import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dd1=sc.nextInt();
        int mm1=sc.nextInt();
        int yy1=sc.nextInt();
        int dd2=sc.nextInt();
        int mm2=sc.nextInt();
        int yy2=sc.nextInt();
        if(yy1<yy2)
        {
            System.out.println("0");
        }
        else if(mm1<mm2&&yy1==yy2)
        {
            System.out.println("0");
        }
        else if((dd1<=dd2)&&(mm1==mm2)&&(yy1==yy2))
        {
            System.out.println("0");
        }        
        else if((dd1>dd2)&&(mm1==mm2)&&(yy1==yy2))
        {
            System.out.println((dd1-dd2)*15);
        }
        else if(mm1!=mm2&&yy1==yy2)
        {
            System.out.println((mm1-mm2)*500);
        }
        else 
        {
            System.out.println("10000");
        }
    }
}