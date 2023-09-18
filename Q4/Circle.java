package Q4;

public class Circle {
	public double radius;
	public static double PI = 3.141592;
	public double high;
	
	public Circle(double radius, double high) {
		this.radius = radius;
		this.high = high;
	}
	
	public double getVolume() {
		return radius * radius * PI * high;
	}
}
