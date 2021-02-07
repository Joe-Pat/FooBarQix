package main.java.mathrules;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
	
	@Test
	@DisplayName("Ensures the divisibility by 3 is well checked")
	public void testIsDivisibleBy3() {
		assertFalse(MathUtils.isDivisibleBy3(7));
		assertTrue(MathUtils.isDivisibleBy3(9));
	}
	
	@Test
	@DisplayName("Ensures the divisibility by 5 is well checked")
	public void testIsDivisibleBy5() {
		assertFalse(MathUtils.isDivisibleBy5(7));
		assertTrue(MathUtils.isDivisibleBy5(10));
	}
	
	@Test
	@DisplayName("Ensures the divisibility by 7 is well checked")
	public void testIsDivisibleBy7() {
		assertFalse(MathUtils.isDivisibleBy7(11));
		assertTrue(MathUtils.isDivisibleBy7(7));
	}
}
