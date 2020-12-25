
    static int B,H;
    static boolean flag;
    static
    {
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        flag=true;
        try
        {
            if(B<=0||H<=0)
            {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        }
        catch(Exception e)
        {
            flag=false;
            System.out.println(e.getMessage());
        }

    }
