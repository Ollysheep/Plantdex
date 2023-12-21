package java2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestOperations {

	private final Calculator calculette = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(11, calculette.add(5, 5));
		assertEquals(-5, calculette.add(5, -10));
	}
	
	@Test
	public void testSub() {
		assertEquals(5, calculette.sub(10, 5));
		assertEquals(-5, calculette.sub(5, 10));
	}
}