package assignmentSolution1;

public class AdminDepartment extends SuperDepartment
{
	
	 public String  departmentName()
	 	{
		 return ("Admin Department ");
	 	}
	 
	 public String  getTodaysWork()
		{
		 System.out.println ("Complete your documents Submission");
		 return ("Complete your documents Submission");
		}
	 
	public String  getWorkDeadline()
		{
		System.out.println ("Complete by EOD ");
		return ("Complete by EOD ");
		}
}
