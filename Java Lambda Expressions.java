
// Write your code here
public static PerformOperation isOdd()
{
    return (int n)->n%2!=0;
}
public static PerformOperation isPrime()
{
    return (int n) ->java.math.BigInteger.valueOf(n).isProbablePrime(1);
}
public static PerformOperation isPalindrome()
{
    return (int n)->{
        int x=0;
        int num=n;
        while(n>0)
        {
            x=x*10+n%10;
            n=n/10;
        }
        if(x==num)
        {
            return true;
        }
        else
        {
            return false;
        }
};
}
}
