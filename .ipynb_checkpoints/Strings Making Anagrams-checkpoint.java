import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int cArr[]=new int[26];
        int cArr1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            cArr[s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++){
            cArr1[s2.charAt(i)-97]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.abs(cArr[i]-cArr1[i]);
        }
        System.out.println(count);
    }
}
