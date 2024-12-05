package CoreJava;

public class Person {
	private String name;
	private int age;
	private String location;
	
	
	public Person(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
	public static void main(String [] args) {
		Person person=new Person("Akshay",31,"Hyderabad");
		person.setName("Uppala");
		person.setAge(30);
		person.setLocation("Guntur");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getLocation());
	}
	

}
