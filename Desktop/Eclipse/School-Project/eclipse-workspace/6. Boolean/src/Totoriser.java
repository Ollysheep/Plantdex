
public class Totoriser {

	public static void main(String[] args) {
		
		// A boolean type is declared with the boolean keyword and can only take the values true or false
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun); // Outputs true
		System.out.println(isFishTasty); // Outputs false
		
		// This is useful to build logic, and find answers.
		
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9
		
		// or even easier
		
		System.out.println(10 > 9); // returns true, because 10 is higher than 9
		
		// In the examples below, we use the equal to (==) operator to evaluate an expression
		
		int z = 10;
		System.out.println(z == 10); // returns true, because the value of z is equal to 10
		
		System.out.println(10 == 15); // returns false, because 10 is not equal to 15
		
		/* In the example below, we use the >= comparison operator to find out if the age (25)
		 * is greater than OR equal to the voting age limit, which is set to 18	 */
		
		int myAge = 25;
		int votingAge = 18;
				System.out.println(myAge >= votingAge);
				
		/* An even better approach, would be to wrap the code above in an if...else statement,
		 * so we can perform different actions depending on the result */
				
		int veroAge = 43;
		int kyaraAge = 14;
		
		if (kyaraAge >= votingAge) {
			System.out.println("Old enough to vote !");
		} else {
			System.out.println("Not old enough to vote.");
			
		if (veroAge >= votingAge) {
			System.out.println("Old enough to vote !");
		} else {
			System.out.println("Not old enough to vote.");
		}
	}
}
}
