
        BigDecimal str[]=new BigDecimal[n];
        for(int i=0;i<n;i++)
        {
            str[i]=new BigDecimal(s[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(str[j].compareTo(str[j+1])<0)
                {
                    String temp;
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                    BigDecimal temp2=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp2;
                }
            }
        }
