package CoreJava;

public class Circle {
	
	private double radius;
	
	
	

	public Circle(double radius) {
		this.radius = radius;
	}

	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculatedArea() {
		return 3.14*radius*radius;
	}
	
	public double parimeter() {
		return 2*3.14*radius;
	}

	public static void main(String[] args) {

		Circle circle= new Circle(20);
		
		System.out.println(circle.getRadius());
		System.out.println(circle.calculatedArea());
		System.out.println(circle.parimeter());
	}

}
