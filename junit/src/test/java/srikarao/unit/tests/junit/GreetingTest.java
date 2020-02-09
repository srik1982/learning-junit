package srikarao.unit.tests.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

	Greeting g;
	
	@BeforeEach
	public void init() {
		g = new GreetingImpl();
	}
	
	@Test
	void testNullOrEmpty() {
		assertThrows(IllegalArgumentException.class, () -> g.greet(null));
		assertThrows(IllegalArgumentException.class, () -> g.greet(""));
	}

	@Test
	void testGreeting() {
		String retVal = g.greet("Srikanth");
		assertNotNull(retVal);
		assertEquals("Hello Srikanth", retVal);
	}
}
