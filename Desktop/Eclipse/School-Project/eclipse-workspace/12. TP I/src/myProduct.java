import java.util.Scanner;

public class myProduct {

	public static void main(String[] args) {
		
			// TP.I.1
		
		System.out.println("-------------------- Exercice 1 --------------------");
		
		int a = 46;
		System.out.println(a);
		int b = 63;
		System.out.println(b);
		
			// TP.I.2
		
		System.out.println("-------------------- Exercice 2 --------------------");
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter C :");
		int C = myObj.nextInt();
		
		System.out.println("Enter D :");
		int D = myObj.nextInt();
		
		System.out.println("Your numbers are " + C + " and " + D);
		
		System.out.println("Then we revert it");
		
		int revertCandD = 0;
		
		revertCandD = C;
		C = D;
		D = revertCandD;
		
		System.out.println("Your final numbers are " + C + " and " + D);
		
			// TP.I.3
		
		System.out.println("-------------------- Exercice 3 --------------------");
		
		System.out.println("Enter E :");
		int E = myObj.nextInt();
		
		boolean pairOuImpair;
		
		if (E % 2 == 0){
			System.out.println( E + " is even.");
		} else {
			System.out.println( E + " is odd.");
		}
		
			// TP.I.4
		
		System.out.println("-------------------- Exercice 4 --------------------");
		
		System.out.println("Enter F :");
		int F = myObj.nextInt();
		
		System.out.println("Enter G :");
		int G = myObj.nextInt();
		
		System.out.println("Enter H :");
		int H = myObj.nextInt();
		
		if ( F > G && F > H) {
			System.out.println(F + " is bigger than " + G + " et " + H);
		} else if ( G > F && G > H) {
			System.out.println(G + " is bigger than " + F + " et " + H);
		} else {
			System.out.println(H + " is bigger than " + F + " et " + G);
		}
		
			// TP.I.5
		
		System.out.println("-------------------- Exercice 5 --------------------");
		
		System.out.println("Enter your month of birth in numeric format :");
		int I = myObj.nextInt();
		switch (I) {
		  case 1:
		    System.out.println("January");
		    break;
		  case 2:
		    System.out.println("February");
		    break;
		  case 3:
		    System.out.println("March");
		    break;
		  case 4:
		    System.out.println("April");
		    break;
		  case 5:
		    System.out.println("May");
		    break;
		  case 6:
		    System.out.println("June");
		    break;
		  case 7:
		    System.out.println("July");
		    break;
		  case 8:
			  System.out.println("August");
			  break;
			  case 9:
				  System.out.println("September");
				  break;
			  case 10:
			    System.out.println("October");
			    break;
			  case 11:
			    System.out.println("November");
			    break;
			  case 12:
			    System.out.println("December");
			    break;
		}
		 System.out.println((char) I);
		 
		// TP.I.6
			
			System.out.println("-------------------- Exercice 6 --------------------");
			
			int J = 0;
			while (J < 5) {
				System.out.println(J);
				J++;
			}

	}

}
