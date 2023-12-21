
//Widening casting is done automatically when passing a smaller size type to a larger size type

public class Totorisation {
public static void main(String[] args) {
	int myInt = 9;
	double myDouble = myInt; // Automatic casting: int to double
	
	System.out.println(myInt); // Outputs 9
	System.out.println(myDouble); // Outputs 9.0
	
//Narrowing casting must be done manually by placing the type in parentheses in front of the value
	
	double myDouble2 = 9.78d;
	int myInt2 = (int) myDouble2; // Manual casting: double to int
	
	System.out.println(myDouble2); // Outputs 9.78
	System.out.println(myInt2); // Outputs 9
	
}
}
