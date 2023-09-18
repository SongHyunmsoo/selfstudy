package 연습문제;

public class practice {
	
	static int sum (int a, int b) {
		return a + b;
	}
	static int minus(int a, int b) {
		return a - b;
	}
	static double divide(double a, double b) {
		return  (double) a / b;
	}
	static int multi(int a, int b) {
		return a * b;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(2, 5));
		System.out.println(minus(2, 5));
		System.out.println(divide(2, 5));
		System.out.println(multi(2, 5));
	}

}
