
public class Toto {

	public static void main(String[] args) {
		
		// Tableau 1er lien
		
				System.out.println("-------------------- Exercice 1 = Arrays --------------------");

		/* Arrays are used to store multiple values in a single variable,
		 * instead of declaring separate variables for each value.
		 * To declare an array, define the variable type with square brackets
		 * To insert values to it, you can place the values in a comma-separated list,
		 * inside curly braces */
		
				String[] carBrand = {"Volvo", "BMW", "Ford", "Mazda"};
				int[] release = {1999, 2015, 2007, 2010};
				
		// You can access an array element by referring to the index number
				
				System.out.println("This " + carBrand[2] + " was released on " + release[2]);
				
		// To change the value of a specific element, refer to the index number
				
				carBrand[2] = "Fiat";
				release[2] = 2004;
				
				System.out.println("This " + carBrand[2] + " was released on " + release[2]);
				
		// To find out how many elements an array has, use the length property
				
				System.out.println(carBrand.length);
				
			
	}

}

