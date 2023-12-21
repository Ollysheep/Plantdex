package ch1;

public class Moteur {
	// Propriétés du moteur : état (allumé ou éteint), vitesse actuelle, vitesse maximale (puis types primitifs modifiés en type d'enveloppe)
	public Boolean on;
	public Integer vitesse;
	public Integer vitesseMax;

	public Moteur (Boolean on, Integer vitesse, Integer vitesseMax) {
		this.on = on;
		this.vitesse = vitesse;
		this.vitesseMax = vitesseMax;
		
		if (vitesse == null || vitesse == 0 || vitesseMax == null || vitesseMax == 0) {
        	throw new IllegalArgumentException();
        }
	}

	// Méthode pour augmenter la vitesse du moteur
	public void accelerer() {
		// Vérifie si le moteur est allumé
		if (on == true) {
			// Vérifie si la vitesse après l'accélération dépasse la vitesse maximale autorisée
			if (vitesse + 10 > vitesseMax)
				throw new RuntimeException("vitesse trop haute"); // Lance une exception si la vitesse dépasse la limite
			vitesse += 10; // Incrémente la vitesse de 10 (si elle ne dépasse pas la vitesse maximale)
		}
	}

	public void decelerer() {
		// Vérifie si le moteur est allumé
		if (on == true) {
			// Vérifie si la vitesse est inférieure à 0
			if (vitesse <= 0)
				throw new RuntimeException("vitesse trop basse"); // Lance une exception si la vitesse est inférieure à 0
			vitesse -= 10; // Décrémente la vitesse de 10 (si elle ne dépasse pas la vitesse maximale)
		}
	}
}