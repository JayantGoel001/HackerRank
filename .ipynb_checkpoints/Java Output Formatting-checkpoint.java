import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x1=sc.nextInt();
                //Complete this line
                int len1=s1.length();
                System.out.print(s1);
                for(int j=0;j<15-len1;j++)
                {
                    System.out.print(" ");
                }
                if(x1==0)
                {
                    System.out.print("000");
                }
                else if(x1/10==0)
                {
                    System.out.print("00"+x1);
                }
                else if(x1/100==0)
                {
                    System.out.print("0"+x1);
                }
                else
                {
                    System.out.print(x1);
                }
                System.out.println();
            }
            System.out.println("================================");

    }
}
