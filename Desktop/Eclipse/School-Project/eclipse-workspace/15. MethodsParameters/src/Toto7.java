
public class Toto7 {

	  // Create a checkAge() method with an integer variable called age
	  static void checkAge(int age) {
		  
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough to watch porn, go to your room !");

	    // If age is greater than, or equal to, 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You can watch porn Audrick !");
	    }

	  }

	  public static void main(String[] args) {
	    checkAge(20); // Call the checkAge method and pass along an age of 20
	  }
}
