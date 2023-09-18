package Q2;

public class student {
	private String major;
	private int stuNum;
	
	public student(String major, int stuNum) {
		this.major = major;
		this.stuNum = stuNum;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getStuNum() {
		return stuNum;
	}
	
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
}
