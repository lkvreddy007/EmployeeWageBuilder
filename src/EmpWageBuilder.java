
public class EmpWageBuilder {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
		
	public static int computeEmpWage(String company,int empRatePerHour,int numofWorkingDays,int maxHoursPerMonth){
		int empHrs=0;
    		int empWage=0;
        	int totalEmpWage=0;
       		int totalEmpHrs=0;
       	 	int totalWorkingDays=0;
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numofWorkingDays) {
			totalWorkingDays+=1;
			int empCheck=(int) Math.floor(Math.random()*10) % 3;
			switch(empCheck) {
					case IS_PART_TIME:
						empHrs=4;
						System.out.println("Employee is Part time employee");
						break;
					case IS_FULL_TIME:
						empHrs=8;
						System.out.println("Employee is Full time employee");
						break;
					default:
						empHrs=0;	
				}
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+totalWorkingDays +" Emp Hr: "+empHrs);
       	}
       	totalEmpWage=totalEmpHrs*empRatePerHour;
       	System.out.println("Total Employee Wage for Company : "+company+" is : "+totalEmpWage);
       	return totalEmpWage;
	}
	public static void main(String[] args) {
		System.out.println("Employee Wage Builder");
    	computeEmpWage("Heritage",30,20,100);
    	computeEmpWage("Smart",15,22,150);
	}
}
