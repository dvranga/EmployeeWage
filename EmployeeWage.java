public class EmployeeWage
{
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public  static int EMP_RATE_PER_HOUR;
        public static  int MAX_OF_WORK_DAYS;
        public static int MAX_WORK_HRS_IN_MONTH;
        public static void main(String[] args) {
            int  totalWage=getTotalWage(20,20,100);
            System.out.println("total employee Wage belongs to dmart comany is "+totalWage);
            totalWage=getTotalWage(50,25,150);
            System.out.println("total employee Wage belongs to relance comany is "+totalWage);
        }
		private static int getTotalWage(int EMP_RATE_PER_HOUR,int MAX_OF_WORK_DAYS,int MAX_WORK_HRS_IN_MONTH) {
			 int empHrs=0;
			 int empWage=0;
             int totalWage=0;
             int totalEmpHrs=0;
             int workingDays=1;
			  while(totalEmpHrs<=MAX_WORK_HRS_IN_MONTH && workingDays<MAX_OF_WORK_DAYS)
              {
				 // System.out.println(EMP_RATE_PER_HOUR+" "+MAX_OF_WORK_DAYS+" "+MAX_WORK_HRS_IN_MONTH);
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
                      workingDays++;
                      totalEmpHrs+=empHrs;
                      empWage=empHrs*EMP_RATE_PER_HOUR;
                   //System.out.println(empWage+"emp dailywage");
                      totalWage+=empWage;
                 // System.out.println(totalWage+"wage for "+workingDays);
              }
			return totalWage;
		}
}
