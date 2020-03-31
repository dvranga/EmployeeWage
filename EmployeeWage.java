public class EmployeeWage
{
	public static void main(String[] args) {
		int FullTime=1;
		double value= Math.floor(Math.random()*10)%2;
		if(value==FullTime)
		{
			System.out.println("employee is present");
		}
		else
		{
			System.out.println("employee is Absent");
		}
	}
}

