package assignmentSolution1;

public class HrDepartment extends SuperDepartment
{

	 public String  departmentName()
	 	{
		 return ("Hr Department ");
	 	}
	 
	 public String  getTodaysWork()
		{
		 System.out.println ("Fill today’s timesheet and mark your attendance");
		 return ("Fill today’s timesheet and mark your attendance");
		}
	 
	public String  getWorkDeadline()
		{
		System.out.println ("Complete by EOD ");
		return ("Complete by EOD ");
		}
	
	public String  doActivity()
	{
	 System.out.println  ("team Lunch");
	 return ("team Lunch");
	}
}
