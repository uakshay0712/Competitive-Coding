package CoreJava;

public class Employee {
	
	private int employee_Id;
	private String employee_name;
	private double employee_salary;

	public Employee(int employee_Id, String employee_name, double employee_salary) {
		super();
		this.employee_Id = employee_Id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
	}

	
	public int getEmployee_Id() {
		return employee_Id;
	}


	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}


	public String getEmployee_name() {
		return employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public String getEmployee_salary() {
		return String.format("Rs%,.2f", employee_salary);
	}



	public static void main(String[] args) {
		
		Employee e= new Employee(100,"Akshay",100000);
		System.out.println(e.getEmployee_Id());
		System.out.println(e.getEmployee_name());
		System.out.println(e.employee_salary);


	}

}
