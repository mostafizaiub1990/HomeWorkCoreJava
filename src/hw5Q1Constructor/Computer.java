package hw5Q1Constructor;

public class Computer {
	// variable declared
	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// default constructor declared
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");
	}

// Parameterized Constructor 01 declared here
	public Computer(String brand, String model, String operatingsystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + ", Model:" + model + ", Operating system: " + operatingsystem
				+ ", Price:" + "$" + price + ", Grade:" + grade + ", and Made in the USA? Ans: " + madeInUSA);

	}

	// Parameterized Constructor 02 declared here
	public Computer(String brand, String model, String operatingsystem, char grade, boolean madeInUSA, int price) {
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		this.price = price;
		System.out.println("My Brand: " + brand + ", Model:" + model + ", Operating system: " + operatingsystem
				+ ", Grade:" + grade + ", and Made in the USA? Ans: " + madeInUSA + ", Price:$" + price);
	}
}
