import java.util.HashMap;
import java.util.Scanner;

public class EmployeeWage
{
	public  String COMPANY_NAME;
	int EMP_RATE_PER_HOUR;
	int MAX_OF_WORK_DAYS;
	int MAX_WORK_HRS_IN_MONTH;
	 public static int empHrs=0;
	 public static final int FULL_TIME=1;
     public static final int PART_TIME=2;
	public EmployeeWage(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int MAX_OF_WORK_DAYS, int MAX_WORK_HRS_IN_MONTH) {
		super();
		this.COMPANY_NAME = COMPANY_NAME;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.MAX_OF_WORK_DAYS = MAX_OF_WORK_DAYS;
		this.MAX_WORK_HRS_IN_MONTH = MAX_WORK_HRS_IN_MONTH;
	}
	
	public int getTotalWage(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int MAX_OF_WORK_DAYS, int MAX_WORK_HRS_IN_MONTH) {
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
	@Override
	public String toString() {
		return "EmployeeWage [EMP_RATE_PER_HOUR=" + EMP_RATE_PER_HOUR + ", MAX_OF_WORK_DAYS=" + MAX_OF_WORK_DAYS
				+ ", MAX_WORK_HRS_IN_MONTH=" + MAX_WORK_HRS_IN_MONTH + "]";
	}

}


 class Companies {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter how many companies data you want to find");
		int number=scanner.nextInt();
        HashMap<String,Integer> hm=new HashMap<>();
       for(int i=0;i<number;i++)
       {
    	   System.out.println("enter company name");
    	   String companyName=scanner.next();
    	   System.out.println("enter the rate per hour");
    	   int ratePerHour=scanner.nextInt();
    	   System.out.println("enter the workingdays in month");
    	   int workingDaysInMonth=scanner.nextInt();
    	   System.out.println("enter the total work Hours");
    	   int totalWorkHours=scanner.nextInt();
    	   
    	   EmployeeWage emp=new EmployeeWage(companyName,ratePerHour, workingDaysInMonth,totalWorkHours );
    	   int value= emp.getTotalWage(companyName, ratePerHour, workingDaysInMonth,totalWorkHours);
    	   hm.put(companyName, value);
       }
       System.out.println("total wage of companies");
       System.out.println(hm); 
       scanner.close();
	}
}

