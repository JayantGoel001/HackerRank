import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.replace('!',' ');
        s=s.replace(',',' ');
        s=s.replace('?',' ');
        s=s.replace('.',' ');
        s=s.replace('_',' ');
        s=s.replace('\'',' ');
        s=s.replace('@',' ');
        StringTokenizer str=new StringTokenizer(s);
        int x=str.countTokens();
        System.out.println(x);
        for(int i=0;i<x;i++)
        {
            System.out.println(str.nextToken());
        }
        scan.close();
    }
}

