
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUnitaires {
	FizzBuzz buzzfizz = new FizzBuzz();
	
	@Test
	public void testFizz() {
		assertEquals("Fizz", buzzfizz.check(57));
	}

	@Test
	public void testBuzz() {
		assertEquals("Buzz", buzzfizz.check(85));
	}
	@Test
	public void testFizzBuzzy() {
		assertEquals("FizzBuzz", buzzfizz.check(45));
	}
}
