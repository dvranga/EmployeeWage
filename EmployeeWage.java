public class EmployeeWage
{
	public static void main(String[] args) {
		int FullTime=1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double value= Math.floor(Math.random()*10)%2;
		if(value==FullTime)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println(empWage);
	}
}
