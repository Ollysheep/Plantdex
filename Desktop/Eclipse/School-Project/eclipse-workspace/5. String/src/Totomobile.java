
public class Totomobile {
	public static void main(String[] args) {
		
		// Create a variable of type String and assign it a value
		
		String greeting = "Hello";
		
		// The length of a string can be found with the length() method
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("the length of the txt string is: " + txt.length());
		
		// There are many string methods available, for example toUpperCase() and toLowerCase()
		
		String txt2 = "Hello World";
		System.out.println(txt2.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt2.toLowerCase()); // Outputs "hello world"
		
		/* The indexOf() method returns the index (the position)
		 * of the first occurrence of a specified text in a string (including whitespace)
		 * Java counts positions from zero. 0 is the first position in a string, 1 is the second, 2 is the third */
		
		String txt3 = "Please locate where 'locate' occurs!";
		System.out.println(txt3.indexOf("locate")); // Outputs 7
	}
}
