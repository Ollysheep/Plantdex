import java.util.Scanner; // use the Scanner class that is already in the eclipse system
public class Totomatisation {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Username"); // gonna output something that you type between ""
		
		String userName = myObj.nextLine(); // Read user input
		System.out.println("Username is: " + userName); // Output user input
		
	    System.out.println("Enter name, age and salary:"); // gonna output something that you type between ""

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();
	    double salary = myObj.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);
	}
}
