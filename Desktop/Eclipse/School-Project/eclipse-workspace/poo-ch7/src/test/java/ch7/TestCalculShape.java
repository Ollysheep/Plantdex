package ch7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch7TP2.Rectangle;
import ch7TP2.Circle;

public class TestCalculShape {

	    @Test
	    public void testAireRectangle() {
	        Rectangle rectangle = new Rectangle(4.0f, 5.0f);
	        assertEquals(20.0f, rectangle.area(),0.001f);
	    }

	    @Test
	    public void testAireCercle() {
	    	Circle cercle = new Circle(3.0f);
	        assertEquals(28.274f, cercle.area(),0.001f);
	    }

	    @Test
	    public void testPerimetreCercle() {
	    	Circle cercle = new Circle(3.0f);
	        assertEquals(18.849f, cercle.perimeter(),0.001f);
	    }

	    @Test
	    public void testPerimetreRectangle() {
	        Rectangle rectangle = new Rectangle(4.0f, 5.0f);
	        assertEquals(18.0f, rectangle.perimeter(),0.001f);
	    }
	}
