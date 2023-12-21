package ch3;

public enum Devise {
	USD, EUR, JPY;

public static double convertir (Devise money, double montant) {
	
	/* J'ai une valeur en USD, si je la veux en EUR, le case va capter le EUR.
	 * "Devise variable" correspond aux devises de mon enum, "double valeur" correspond à la valeur que je veux convertir.
	 */
	
	double convertion = 0;
	switch (money) {
	case EUR:
		convertion = montant * 0.91;
		break;

	case JPY:
		convertion = montant * 147.00;
		break;
	}
	return convertion;           
}
}

