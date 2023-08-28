package hw3JavaVariables;

public class AboutMe {
	public String myName;// variable declared
	public byte myAge = 33;
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

	public void aboutMe() {
		System.out.println("I am aboutMe method");
	}

}
