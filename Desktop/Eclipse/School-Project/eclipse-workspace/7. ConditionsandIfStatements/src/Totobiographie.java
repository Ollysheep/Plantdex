
public class Totobiographie {

	public static void main(String[] args) {
		
		// Use the if statement to specify a block of Java code to be executed if a condition is true.
		
		if (20 > 18) {
			System.out.println("20 is greater than 18");
		}
		// or
		
		int x = 54;
		int y = 45;
		if (x > y) {
			System.out.println("x is greater than y");
		}
		
		// Use the else statement to specify a block of code to be executed if the condition is false.
		
		double bankAccount = 20.99;
		
		if (bankAccount <= 18.99) {
			System.out.println("Card declined.");
		} else {
			System.out.println("Payment accepted.");
		}
		
		// Use the else if statement to specify a new condition if the first condition is false.
		
		int time = 20;
		
		if (time < 10) {
			System.out.println("Good morning.");
		} else if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		
	}
}
