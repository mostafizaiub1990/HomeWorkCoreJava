package hw4JavaVariablesInitialized;
/*3: Inside the void type method "aboutMe" body, call all the variables inside syso. (you can use String concatenation to make it a more meaningful outcome). Step 4: Inside "AboutMeTest" Class, remove the variables called by the object. object will only call the aboutMe method. Step 5: Follow indentation by Organizing the code. push to GitHub and paste the link of GitHub below.*/

public class AboutMe {
	public  String myName;// variable declared
	public  byte myAge = 33;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 22372;
	public long myBankBalance = 6465636;
	public float myHeight = 1.65473f;
	public double myGrade = 3.46;
	public char myGender = 'M';
	public boolean usCitizen = false;

	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}

	public  void aboutMe() {
		System.out.println("I am aboutMe method");
		System.out.println("my age is "+myAge);
	}


}


