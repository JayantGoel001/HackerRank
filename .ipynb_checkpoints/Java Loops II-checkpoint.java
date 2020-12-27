import java.util.*;
import java.io.*;
import java.lang.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int x;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<=n;j++)
            {
                x=a+b*(int)(Math.pow(2,j)-1);
                System.out.print(x+" ");
            }
            System.out.println();
        }
        in.close();
    }
}