class Student extends Person{
	private int[] testScores;

    Student(String fn,String ln,int id,int ts[])
    {
        super(fn,ln,id);
        testScores=ts;
    }
    char calculate()
    {
        int len=testScores.length;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=testScores[i];
        }
        int avg=sum/len;
        if(avg>=90&&avg<=100)
        {
            return 'O';
        }
        else if(avg>=80&&avg<90)
        {
            return 'E';
        }
        else if(avg>=70&&avg<80)
        {
            return 'A';
        }
        else if(avg>=55&&avg<70)
        {
            return 'P';
        }
        else if(avg>=40&&avg<55)
        {
            return 'D';
        }
        else
        {
            return 'T';
        }
    }
}