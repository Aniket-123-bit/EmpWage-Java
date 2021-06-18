package empwage;

public class EmpWageComputationMultipleCompany {
	int empCheck = (int) (Math.floor(Math.random()*10)%3);
	static final int fullTime = 1;
	static final int partTime = 2;
	String companyName = "";
	int empHrs = 0;
	int totalDays;
	int ratePerHr;
	int salary;
	
	public EmpWageComputationMultipleCompany(String companyName, int totalDays, int ratePerHr) {
		this.companyName = companyName;
		this.totalDays = totalDays;
		this.ratePerHr = ratePerHr;
	}
	
	public void empChecking() {
		int TotalSalary=0;
		int day=0;
		int noOfHrs=0;
		
		while(day<totalDays && noOfHrs<100) {
			int empCheck = (int) (Math.floor(Math.random()*10)%3);
			switch(empCheck) {
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
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee wage Computation Program");
		System.out.println("**************************************");
		
		EmpWageComputationMultipleCompany dmart = new EmpWageComputationMultipleCompany("D-Mart", 30 ,20);
		dmart.empChecking();
		System.out.println("**************************************");
		
		EmpWageComputationMultipleCompany tata = new EmpWageComputationMultipleCompany("TATA", 25, 30);
		tata.empChecking();
		System.out.println("**************************************");
		
		EmpWageComputationMultipleCompany dAniket = new EmpWageComputationMultipleCompany("D-Aniket", 20 ,30);
		dAniket.empChecking();
		
	}

}
