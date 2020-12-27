
//Write your code here
class Calculator
{
    public static int power(int n,int p)throws Exception
    {
        /*try
        {
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
           // throw e;
        }
        return -1;*/
        if(n<0||p<0)
        {
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n,p);
    }
}

