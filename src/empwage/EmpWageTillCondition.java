package empwage;
//Assume 100 hours 20 days

public class EmpWageTillCondition {
	static final int fullTime=1;
	static final int partTime=2;
	static int ratePerHr=20;
	static int TotalDays=20;
	
	public static void main(String[] args) {
		
		int empHrs = 0;
		int salary = 0;
		int TotalSalary=0;
		int day=0;
		int noOfHrs=0;
		while(day<TotalDays && noOfHrs<=100)
		{		
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
			case fullTime:
				empHrs=8;
				salary=empHrs*ratePerHr;
				break;
				
			case partTime:
				empHrs=4;
				salary=empHrs*ratePerHr;
				break;
				
			default:
				empHrs=0;
			}
		    TotalSalary=TotalSalary+salary;
		    noOfHrs=noOfHrs+empHrs;
		    day++;
		}
		System.out.println("Total No Of Hrs: "+noOfHrs);
		System.out.println("Total Employee Wage: "+TotalSalary);
	}

}
