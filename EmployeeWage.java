public class EmployeeWage
{
	public static String COMPANY_NAME;
	int EMP_RATE_PER_HOUR;
	int MAX_OF_WORK_DAYS;
	int MAX_WORK_HRS_IN_MONTH;
	 public static int empHrs=0;
	 public static final int FULL_TIME=1;
     public static final int PART_TIME=2;
	public EmployeeWage(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int MAX_OF_WORK_DAYS, int MAX_WORK_HRS_IN_MONTH) {
		super();
		EmployeeWage.COMPANY_NAME = COMPANY_NAME;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.MAX_OF_WORK_DAYS = MAX_OF_WORK_DAYS;
		this.MAX_WORK_HRS_IN_MONTH = MAX_WORK_HRS_IN_MONTH;
	}
	public static void main(String[] args) {
		EmployeeWage emp=new EmployeeWage("Dmart",20, 20,100 );
		int  totalWage=emp.getTotalWage("Dmart",20,20,100);
        System.out.println("total employee Wage"+COMPANY_NAME + " is "+totalWage);
        totalWage=emp.getTotalWage("Relance",50,25,150);
        System.out.println("total employee Wage"+COMPANY_NAME+" comany is "+totalWage);
	}
	private  int getTotalWage(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int MAX_OF_WORK_DAYS, int MAX_WORK_HRS_IN_MONTH) {
		System.out.println("calculating the employeewage of company "+COMPANY_NAME); 
		 int empWage=0;
         int totalWage=0;
         int totalEmpHrs=0;
         int workingDays=1;
         
		  while(totalEmpHrs<=MAX_WORK_HRS_IN_MONTH && workingDays<MAX_OF_WORK_DAYS)
          {
                 empHrs=getHrs();
                  workingDays++;
                  totalEmpHrs+=empHrs;
                  empWage=empHrs*EMP_RATE_PER_HOUR;
               
                  totalWage+=empWage;
          }
		return totalWage;
	}
	private static int getHrs() {
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
		return empHrs;
	}
}

