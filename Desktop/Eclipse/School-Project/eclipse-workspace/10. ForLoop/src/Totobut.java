
public class Totobut {

	public static void main(String[] args) {
		
		/* When you know exactly how many times you want to loop through a block of code,
		 * use the for loop instead of a while loop */
		
		for (int i = 0; i < 5; i++) {
			/* Statement 1 is executed (one time) before the execution of the code block.
			 * Statement 2 defines the condition for executing the code block.
			 * Statement 3 is executed (every time) after the code block has been executed. */
			
			System.out.println(i);
		}
		
		/* Statement 1 sets a variable before the loop starts (int i = 0).
		 * Statement 2 defines the condition for the loop to run (i must be less than 5).
		 * If the condition is true, the loop will start over again, if it is false, the loop will end.
		 * Statement 3 increases a value (i++) each time the code block in the loop has been executed. */
		
		for (int j = 0; j <= 10; j = j + 2) {
			System.out.println(j);
		}

		/* It is also possible to place a loop inside another loop. This is called a nested loop.
		 * The "inner loop" will be executed one time for each iteration of the "outer loop" */
		
		// Outer loop
		for (int k = 1; k <= 2; k++) {
			System.out.println("Outer: " + k); // Executes 2 times
			
		// Inner loop
		for (int l = 1; l <= 3; l++) {
			System.out.println(" Inner: " + l); // Executes 6 times (2 * 3)
		}
		}
		
	}

}
