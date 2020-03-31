public class EmployeeWage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0;
		int value= (int) (Math.floor(Math.random()*10)%3);
		switch (value)
		{
			case FULL_TIME:
				empHrs=8;
				break;
			case PART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println(empWage);
	}
}

