package ch1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestMoteur {

	// Teste l'accélération lorsque la vitesse dépasse la vitesse maximale
	@Test
	void testAccelerer() {
		Moteur engin = new Moteur(true, 12, 130);
		engin.vitesse = 160;
		engin.vitesseMax = 110;
		engin.on = true;

		// Vérifie si l'accélération lance une RuntimeException
		assertThrows(RuntimeException.class, () -> engin.accelerer());
	}

	// Teste la décélération lorsque la vitesse est déjà à zéro
	@Test
	void testDecelerer() {
		Moteur engin = new Moteur(true, 12, 130);
		engin.vitesse = 0;
		engin.on = true;

		// Vérifie si la décélération lance une RuntimeException
		assertThrows(RuntimeException.class, () -> engin.decelerer());
	}

	// Teste l'accélération et la décélération normales du moteur
	@Test
	void testAccelererEtDecelerer() {
		Moteur engin = new Moteur(true, 12, 130);
		engin.vitesseMax = 130;
		engin.vitesse = 20;
		engin.on = true;

		// Vérifie si l'accélération ne lance pas d'exception
		assertDoesNotThrow(() -> engin.accelerer());
		// Vérifie si la vitesse après l'accélération est correcte
		assertEquals(30, engin.vitesse);

		// Vérifie si la décélération ne lance pas d'exception
		assertDoesNotThrow(() -> engin.decelerer());
		// Vérifie si la vitesse après la décélération est correcte
		assertEquals(20, engin.vitesse);
	}
	
	@Test
	void testExceptionMoteur() {
		assertThrows(IllegalArgumentException.class, () -> {
			Moteur moteur = new Moteur(true, 0, 130);
		});
	}

}
