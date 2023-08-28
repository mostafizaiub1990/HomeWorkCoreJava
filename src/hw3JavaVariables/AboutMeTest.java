package hw3JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe kazi = new AboutMe();
		kazi.myName = "kazi"; // here initialized
		System.out.println("My name is " + kazi.myName + "\nMy age is " + kazi.myAge + "\nMy Apartment Rent is "
				+ kazi.myApartmentRent + "\nMy Yarly Salary is " + kazi.myYearlySalary + "\nMy Bank Balance is "
				+ kazi.myBankBalance + "\nMy Height is " + kazi.myHeight + "\nMy Gender is " + kazi.myGender
				+ "\nMy Grade is " + kazi.myGrade + "\nMy US Citizenship News Status is " + kazi.usCitizen);
		kazi.aboutMe();
	}

}