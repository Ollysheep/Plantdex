
public class Toto3 {

	/* Information can be passed to methods as parameter. Parameters act as variables inside the method.
	 * Parameters are specified after the method name, inside the parentheses.
	 * You can add as many parameters as you want, just separate them with a comma.
	 */
	
	 static void myMethod(String fname, int age) {
		    System.out.println(fname + " Nébouré is only " + age);
		  }

		  public static void main(String[] args) {
		    myMethod("Derek", 19);
		    myMethod("Tom", 16);
		    myMethod("Jean", 13);
		  }
		  
}
