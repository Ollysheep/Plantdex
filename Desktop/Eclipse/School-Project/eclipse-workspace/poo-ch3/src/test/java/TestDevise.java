import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch3.Devise;

public class TestDevise {

    @Test
    public void testConversionDevises() {
        double montantEnUSD = 100.0;

        double montantConvertiEnEUR = Devise.convertir(Devise.EUR, montantEnUSD);
        assertEquals(91.0, montantConvertiEnEUR, 0.001); // Conversion en EUR

        double montantConvertiEnJPY = Devise.convertir(Devise.JPY, montantEnUSD);
        assertEquals(14700.0, montantConvertiEnJPY, 0.001); // Conversion en JPY
    }
}
