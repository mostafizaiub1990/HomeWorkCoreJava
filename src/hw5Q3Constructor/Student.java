package hw5Q3Constructor;
/*Q 2. HW05B: Create a package name "hw5Q3Constructor" in your Home Work project. Inside the package, a) Create a class "Student". Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade (as float). Declare the default constructor and only one parameterized constructor by using (hints: source -- generate constructor using fields-). Use only one System.out.println() in the parameterized constructor to declare the above variables. b) Create another class StudentTest. Create object as many as you want under the main method. Initialize constructors. My expectation is to see in the console as --> This is from the default Constructor of the Student class. in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade: <your grade> and Java Programmer? Ans: true. Organize the code. Push in the GitHub. Paste your GitHub link below.*/

public class Student {
//Variable declared
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	// default constructor declared
	public Student() {
		System.out.println("hints: source -- generate constructor using fields-");
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", Id:" + stID + ", Sex: " + sex + ", Java Programmer? Ans:" + isProgrammer + ", Grade: " + grade);
	}

	/*
	 * /Parameterized Constructor declared here public Student(String stName, int
	 * stID, char sex, boolean isProgrammer, float grade) { this.stName = stName;
	 * this.stID = stID; this.sex = sex; this.isProgrammer = isProgrammer;
	 * this.grade = grade; System.out.println("Student Name: " + stName + ", Id:" +
	 * stID + ", Sex: " + sex + ", Java Programmer? Ans:" + isProgrammer +
	 * ", Grade: " + grade); }
	 */
}