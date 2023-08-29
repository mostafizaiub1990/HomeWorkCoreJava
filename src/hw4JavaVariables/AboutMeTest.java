package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		/* constructors are called when an object is created(Example:kazi, Alex) */
		AboutMe kazi = new AboutMe();
		AboutMe Alex = new AboutMe();
		kazi.myName = "Kazi"; // here initialized
		kazi.myAge = 33;
		kazi.myApartmentRent = 32767;
		kazi.myYearlySalary = 22372;
		kazi.myBankBalance = 6465636;
		kazi.myHeight = 5.6f;
		kazi.myGrade = 3.46;
		kazi.myGender = 'M';
		kazi.usCitizen = false;

		Alex.myName = "Alex";// here initialized
		Alex.myAge = 32;
		Alex.myApartmentRent = 31767;
		Alex.myYearlySalary = 21372;
		Alex.myBankBalance = 6965636;
		Alex.myHeight = 5.10f;
		Alex.myGrade = 2.46;
		Alex.myGender = 'F';
		Alex.usCitizen = false;

		kazi.aboutMe();
		Alex.aboutMe();
	}

}