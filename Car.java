package CoreJava;

public class Car {
	
	private String company_Name;
	private String model_Name;
	private int year;
	private int milage;
	
	

	public Car(String company_Name, String model_Name, int year, int milage) {
		this.company_Name = company_Name;
		this.model_Name = model_Name;
		this.year = year;
		this.milage = milage;
	}

	

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	
	
	public String getModel_Name() {
		return model_Name;
	}

	public void setModel_Name(String model_Name) {
		this.model_Name = model_Name;
	}



	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
	public int getMilage() {
		return milage;
	}


	public static void main(String[] args) {
		Car car = new Car("Tata","Harrier",2024,23);
		System.out.println(car.getCompany_Name());
		System.out.println(car.getModel_Name());
		System.out.println(car.getYear());
		System.out.println("Milage: "+car.getMilage());
		car.setCompany_Name("Hyundai");
		car.setModel_Name("i20");
		car.setYear(2024);
		System.out.println(car.getCompany_Name());
		System.out.println(car.getModel_Name());
		System.out.println(car.getYear());
		System.out.println(car.getMilage());

	}

}
