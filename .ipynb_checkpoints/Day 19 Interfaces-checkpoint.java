class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
              { 
                  sum=sum+i;
              }
        }
        return sum;
    }
}