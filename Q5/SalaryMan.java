package Q5;

public class SalaryMan {
	int salary;
	
	public SalaryMan() {
		this.salary = 1000000;
	}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		return (this.salary * 12) + (this.salary * 6);
	}
}
