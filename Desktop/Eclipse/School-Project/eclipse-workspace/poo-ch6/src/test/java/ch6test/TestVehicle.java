package ch6test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ch6TP1.Moteur;
import ch6TP1.Vehicle;

public class TestVehicle {
	
	@Test
	void testExceptionVehiculeBrandNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			Vehicle tuture = new Vehicle(null, "Punto", 2004, false, new Moteur(true, 50, 140));
		});
	}
	
	@Test
	void testExceptionVehiculeModelEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			Vehicle tuture = new Vehicle("Fiat", "", 2004, false, new Moteur(true, 50, 140));
		});
	}
	
	
	@Test
	void testExceptionYearLongAgo() {
		assertThrows(IllegalArgumentException.class, () -> {
			Vehicle tuture = new Vehicle("Fiat", "Punto", 1923, false, new Moteur(true, 50, 140));
		});
	}
	
	@Test
	void testExceptionVehiculeFastAndFurious() {
		assertThrows(IllegalArgumentException.class, () -> {
			Vehicle tuture = new Vehicle("Fiat", "Punto", 2004, false, new Moteur(true, 50, 560));
		});
	}

}
