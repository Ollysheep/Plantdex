
public class Totoballon {

	public static void main(String[] args) {
		
		/* Loops can execute a block of code as long as a specified condition is reached.
		 * The while loop loops through a block of code as long as a specified condition is true
		 * In the example below, the code in the loop will run, over and over again,
		 * as long as a variable (i) is less than 5	 */
		
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		// Do not forget to increase the variable used in the condition, otherwise the loop will never end!
		
		/* The do/while loop is a variant of the while loop. This loop will execute the code block once,
		 * before checking if the condition is true.
		 * The example below uses a do/while loop. The loop will always be executed at least once,
		 * even if the condition is false, because the code block is executed before the condition is tested */
		
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}
		while (j < 5);
	}

}
