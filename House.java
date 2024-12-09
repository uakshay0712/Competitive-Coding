package CoreJava;

import java.util.Scanner;

public class House {
	
	private String address;
	private int numberOfRooms;
	private double area;
	
	
	public House(String address, int numberOfRooms, double area) {
		super();
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.area = area;
	}

	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNumberOfRooms() {
		return numberOfRooms;
	}


	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}

	public double calculatedArea(double pricePerSFt) {
		return area*pricePerSFt;
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		House h= new House("555, Phase-1, Gachibowli", 4, scr.nextDouble());
		System.out.println(h.getAddress());
		System.out.println(h.getNumberOfRooms());
		System.out.println(h.getArea());

	}

}
