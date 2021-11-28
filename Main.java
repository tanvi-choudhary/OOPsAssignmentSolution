package assignmentSolution1;

public class Main 
{

	public static void main(String[] args) 
	{
		
		HrDepartment    hr = new HrDepartment();
		TechDepartment  tc = new TechDepartment();
		AdminDepartment ad = new AdminDepartment();
		
		System.out.println("Welcome to " +ad.departmentName());
		ad.getTodaysWork();
		ad.getWorkDeadline();
		ad.isTodayAHoliday();
		
		System.out.println();
		
		System.out.println("Welcome to " +hr.departmentName());
		hr.doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		
		System.out.println();
		
		System.out.println("Welcome to " +tc.departmentName());
		tc.getTodaysWork();
		tc.getWorkDeadline();
		tc.getTechStackInformation();
		tc.isTodayAHoliday();
		
		

	}

}
