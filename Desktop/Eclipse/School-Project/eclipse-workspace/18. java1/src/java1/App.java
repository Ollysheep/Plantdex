package java1;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Calculette calculette = new Calculette();
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			
			int a = rnd.nextInt(1,10);
			int b = rnd.nextInt(1,10);
			
			System.out.println("Opérations sur "+a+" et "+b);			
			System.out.println("Add : "+calculette.add(a,b));
			System.out.println("Sub : "+calculette.sub(a,b));
			System.out.println("Mul : "+calculette.mul(a,b));
			System.out.println("Div : "+calculette.div(a,b));
			System.out.println("-----------------------------");			
		}
	}
}
