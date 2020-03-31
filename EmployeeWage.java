public class EmployeeWage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORK_DAYS=20;
	public static void main(String[] args) {
		
		int empHrs=0;
		int empWage=0;
		int totalWage=0;
		for(int days=1;days<=NUM_OF_WORK_DAYS;days++)
		{
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
			//System.out.println(empWage+"emp dailywage");
			totalWage+=empWage;
			//System.out.println(totalWage+"wage for "+days);
		}
		System.out.println("total employee Wage is "+totalWage);
	}
}

