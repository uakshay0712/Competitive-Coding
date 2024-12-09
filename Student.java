package CoreJava;

import java.util.Scanner;

public class Student {
	
	private int student_id;
	private String student_name;
	private double grades;
	
	

	public Student(int student_id, String student_name, double grades) {

		this.student_id = student_id;
		this.student_name = student_name;
		this.grades = grades;
	}

	

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}



	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void addGrade(int n) {
		if(n>=90) {
			System.out.println("Grade A");
		}else if(n>=75 && n<90)
			System.out.println("Grade B");
		else if(n>=60 && n<75 )
			System.out.println("Grade C");
		else if(n>=50 && n<60)
			System.out.println("Grade D");
		else if(n>=35 && n<50)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
	
		Student stu= new Student(10,"Akshay",80);
		System.out.println(stu.getStudent_id());
		System.out.println(stu.getStudent_name());
		System.out.println(stu.grades);
		
	}

}
