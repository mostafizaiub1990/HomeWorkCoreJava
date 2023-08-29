package hw4JavaVariables;

public class AboutMe {
	// variable declared
	public String myName;
	public byte myAge;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;

	// Constructor -->
	public AboutMe() {
		System.out.println("This is all about us: ");
	}


	public void aboutMe() {
		System.out.println("My name is " + myName + "\nMy age is " + myAge + "\nMy Apartment Rent is " + myApartmentRent
				+ "\nMy Yarly Salary is " + myYearlySalary + "\nMy Bank Balance is " + myBankBalance + "\nMy Height is "
				+ myHeight + "\nMy Gender is " + myGender + "\nMy Grade is " + myGrade
				+ "\nMy US Citizenship News Status is " + usCitizen);
	}
}
