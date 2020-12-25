
class Add
{
    public static void add(int ...a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(i!=a.length-1)
              {
                  System.out.print(a[i]+"+");
                  sum=sum+a[i];
              }
              else
              {
                  sum=sum+a[i];
                  System.out.print(a[i]+"="+sum);
              }
        }
        System.out.println();
    }
}

