import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        BitSet ar1=new BitSet(n);
        BitSet ar2=new BitSet(n);
        for(int i=0;i<m;i++)
        {
            String st=sc.next();
            int set=sc.nextInt();
            int index=sc.nextInt();
            if(st.equals("AND") && set==1)
            {
                ar1.and(ar2);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("AND") && set==2)
            {
                ar2.and(ar1);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("OR") && set==1)
            {
                ar1.or(ar2);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("OR") && set==2)
            {
                ar2.or(ar1);
                /*for(boolean i2:ar2)
                {
                    System.out.println("*"+i2);
                }*/
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("XOR") && set==1)
            {
                ar1.xor(ar2);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("XOR") && set==2)
            {
                ar2.xor(ar1);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("FLIP") && set==1)
            {
                ar1.flip(index);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("FLIP") && set==2)
            {
                ar2.flip(index);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());

            }
            else if(st.equals("SET") && set==1)
            {
                ar1.set(index);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
            else if(st.equals("SET") && set==2)
            {
                ar2.set(index);
                System.out.println(ar1.cardinality()+" "+ar2.cardinality());
            }
        }
    }
}
