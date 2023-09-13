package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {
		int i = 33;
		if (i == 18) {
			System.out.println("I am a Voter");
		} else if (i < 18) {
			System.out.println("I am not a Voter");
		} else if (i > 18) {
			System.out.println("I am a Voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}
	}
}
