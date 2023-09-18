package Q2;

public class studentExample {

	public static void main(String[] args) {
		student stu = new student("Math", 20230915);
		
		System.out.println("전공 : " + stu.getMajor());
		System.out.println("학번 : " + stu.getStuNum());
		
		stu.setMajor("Korean");
		stu.setStuNum(19990727);
		
		System.out.println("전공 : " + stu.getMajor());
		System.out.println("학번 : " + stu.getStuNum());
	}

}
