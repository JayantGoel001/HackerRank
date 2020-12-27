static boolean isAnagram(String a, String b) {
    // Complete the function
    int len1=a.length();
    int len2=b.length();
    int i=0,j;
    a=a.toLowerCase();
    b=b.toLowerCase();
    char temp;
    char na[]=new char[len1];
    char nb[]=new char[len2];
    while(i!=len1)
    {
        na[i]=a.charAt(i);
        i++;
    }
    i=0;
    while(i!=len2)
    {
        nb[i]=b.charAt(i);
        i++;
    }
    for(i=0;i<len1-1;i++)
    {
        for(j=0;j<len1-i-1;j++)
        {
            if(na[j]>na[j+1])
            {
                temp=na[j];
                na[j]=na[j+1];
                na[j+1]=temp;
            }
        }
    }
    for(i=0;i<len2-1;i++)
    {
        for(j=0;j<len2-i-1;j++)
        {
            if(nb[j]>nb[j+1])
            {
                temp=nb[j];
                nb[j]=nb[j+1];
                nb[j+1]=temp;
            }
        }
    }
    int c=0;
    if(len1==len2)
    {
        i=0;
        while(i!=len1)
        {
            if(na[i]==nb[i])
            {
                c++;
            }
            i++;
        }
    }
    if(c==len1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

