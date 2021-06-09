package empwage;

public class SwitchStatement {
	static final int fullTime=1;
	static final int partTime=2;
	int ratePerHr=20;
	int salary;
	int empHrs=0;
	
	//computation
	int empCheck = (int) (Math.floor(Math.random()*10)%3);
	
	public void empChecking() {
		switch(empCheck){
		case fullTime:
			System.out.println("Emloyee is Fulltime");
			empHrs=8;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
			break;
			
		case partTime:
			System.out.println("Employee is PartTime");
			empHrs=4;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
			break;
			
		default:
			System.out.println("Employee is Absent");
		}

	}

	public static void main(String[] args) {
		SwitchStatement e = new SwitchStatement();
		e.empChecking();
	}


}
