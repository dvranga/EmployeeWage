public class EmployeeWage
{
	public static void main(String[] args) {
		int FULL_TIME=1;
		int PART_TIME=0;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double value= Math.floor(Math.random()*10)%3;
		if(value==FULL_TIME)
		{
			empHrs=8;
		}
		else if(value==PART_TIME)
		{
			empHrs=4;
		}
		else
			empHrs=0;
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println(empWage);
	}
}

