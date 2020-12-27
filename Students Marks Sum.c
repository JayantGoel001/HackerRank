

//Complete the following function.

int marks_summation(int* marks, int number_of_students, char gender) 
{
    int sum=0;
    int i;
    if(gender=='b')
    {
        for(i=0;i<number_of_students;i+=2)
        {
            sum+=*(marks+i);
        }
    }
    else
    {
        for(i=1;i<number_of_students;i+=2)
        {
            sum+=*(marks+i);
        }
    }
    return sum;
}

