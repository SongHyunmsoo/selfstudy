package Q5;

public class SalaryManExample {

	public static void main(String[] args) {
		SalaryMan salaryMan = new SalaryMan();
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
