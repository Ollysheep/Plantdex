
public class Totocensure {

	public static void main(String[] args) {
		
		/* The break statement can be used to jump out of a loop
		 * The break statement can be used to jump out of a switch */
		
		System.out.println(" Exo I");
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
		System.out.println(i);
		}

		/*The continue statement breaks one iteration (in the loop),
		 * if a specified condition occurs, and continues with the next iteration in the loop. */
		
		System.out.println(" Exo J");
		
		for (int j = 0; j < 10; j++) {
			if (j == 4) {
				continue;
			}
		System.out.println(j);
		}
		
		// You can also use break and continue in while loops
		
		System.out.println(" Exo K");
		
		int k = 0;
		while (k < 10) {
			System.out.println(k);
			k++;
			if (k == 4) {
				break;
			}
		}
		
		System.out.println(" Exo L");
		
		int l = 0;
		while (l < 10) {
			if (l == 4) {
				l++;
				continue;
			}
			System.out.println(l);
			l++;
		}
	}

}
