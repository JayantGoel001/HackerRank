

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
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

