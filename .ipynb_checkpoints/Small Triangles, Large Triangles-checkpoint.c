float area(triangle*,int);
void sort_by_area(triangle* tr, int n) {
    triangle temp;
    int i,j;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(area(tr,j)>area(tr,j+1))
            {
                temp=*(tr+j);
                *(tr+j)=*(tr+j+1);
                *(tr+j+1)=temp;
            }
        }
    }
}
float area(triangle *tr,int x)
{
    float p;
    p = (tr + x)->a + (tr + x)->b + (tr + x)->c;
    p=p/2.0;
    float s;
    s=sqrt(p*(p-((tr+x)->a))*(p-(tr+x)->b)*(p-(tr+x)->c));
    return s;
}