package 연습문제;

public class pmmd {
	public static void main(String[] args) {
		// 객체 생성
		math obj = new math();
		
		// 덧셈 
		int sum = obj.add(2, 3);
		System.out.println(sum);
		
		// 뺄셈
		int sub = obj.min(2, 3);
		System.out.println(sub);
		
		// 곱셈
		int mul = obj.mul(2, 3);
		System.out.println(mul);
		
		// 나눗셈
		int div = obj.div(2, 3);
		System.out.println(div);
	}
}
