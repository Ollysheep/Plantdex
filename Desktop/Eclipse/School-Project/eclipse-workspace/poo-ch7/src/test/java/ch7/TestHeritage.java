package ch7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ch7TP1.Capitale;
import ch7TP1.Monument;
import ch7TP1.Ville;

public class TestHeritage { 

	    @Test
	    public void testVilleConstructorAndGettersSetters() {
	        Ville ville = new Ville("Paris", 2000000);

	        assertEquals("Paris", ville.getName());
	        assertEquals(2000000, ville.getPopulation());
	    }

	    @Test
	    public void testMonumentGetterSetter() {
	        Monument monuments = new Monument();
	        monuments.setName("Tour Eiffel");

	        assertEquals("Tour Eiffel", monuments.getName());
	    }

	    @Test
	    public void testCapitaleConstructorAndGettersSetters() {
	        Monument tourEiffel = new Monument();
	        tourEiffel.setName("Tour Eiffel");

	        Monument arcDeTriomphe = new Monument();
	        arcDeTriomphe.setName("Arc de Triomphe");

	        List<Monument> monuments = Arrays.asList(tourEiffel, arcDeTriomphe);

	        Capitale capitale = new Capitale("Paris", 2000000, monuments);

	        assertEquals("Paris", capitale.getName());
	        assertEquals(2000000, capitale.getPopulation());
	        assertNotNull(capitale.getMonuments());;
	    }
	}


