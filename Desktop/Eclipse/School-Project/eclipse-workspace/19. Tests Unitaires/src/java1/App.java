package java1;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Calculator calculette = new Calculator();
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			
			int a = rnd.nextInt(1,10);
			int b = rnd.nextInt(1,10);
			
			System.out.println("-----------------------------");
			System.out.println("Opérations for "+a+" and "+b);			
			System.out.println("Addition : "+calculette.add(a,b));
			System.out.println("Substraction : "+calculette.sub(a,b));
			System.out.println("Multiplication : "+calculette.mul(a,b));
			System.out.println("Division : "+calculette.div(a,b));
			System.out.println("-----------------------------");			
		}
	}
}