
int  sum (int count,...) 
{
    va_list x;
    va_start(x,count);
    int sum=0;
    for(int i=0;i<count;i++)
    {
        sum+=va_arg(x,int);
    }
    va_end(x);
    return sum;
}
int min(int count,...) 
{
    va_list x;
    va_start(x,count);
    int min=999999;
    for(int i=0;i<count;i++)
    {
        int z=va_arg(x,int);
        if(z<min)
        {
            min=z;
        }
    }
    va_end(x);
    return min;
}

int max(int count,...) {
    va_list x;
    va_start(x,count);
    int max=-999999;
    for(int i=0;i<count;i++)
    {
        int z=va_arg(x,int);
        if(z>max)
        {
            max=z;
        }
    }
    va_end(x);
    return max;
}

