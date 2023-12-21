public class App {

	public static void main(String[] args) {

		FizzBuzz buzzfizz = new FizzBuzz();

		int i;

		for (i = -5; i <= 103; i++) {
			System.out.println(buzzfizz.check(i));
		}

	}
}
