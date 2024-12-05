package CoreJava;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	public double calculatedArea() {
		return length*width;
	}
	
	public double parameter() {
		return 2*(length+width);
	}
	public static void main(String[] args) {
		Rectangle r= new Rectangle(10.0, 4.5);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.calculatedArea());
		System.out.println(r.parameter());

	}

}
