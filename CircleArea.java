package prog;

class circle {
	final double pi = 3.14;

	public double AreaOfCircle(double r) {
		double area = pi * (r * r);
		return area;
	}
}

public class CircleArea {
	public static void main(String[] args) {
		circle c = new circle();
		double area = c.AreaOfCircle(12);
		System.out.println(area);
	}

}
