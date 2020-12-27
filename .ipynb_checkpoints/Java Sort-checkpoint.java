import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class Sorting implements Comparator<Student>
{
    @Override
    public int compare(Student cust1,Student cust2)
    {
        double cgpa1=cust1.getCgpa();
        double cgpa2=cust2.getCgpa();
        if(cgpa1>cgpa2)
        {
            return -1;
        }
        else if(cgpa1<cgpa2)
        {
            return 1;
        }
        else
        {
            int namecom=cust1.getFname().compareTo(cust2.getFname());
            if(namecom==0)
            {
                int id1=cust1.getId();
                int id2=cust2.getId();
                if(id1>id2)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            else
            {
                return namecom;
            }
        }
    }

}
//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList,new Sorting());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}