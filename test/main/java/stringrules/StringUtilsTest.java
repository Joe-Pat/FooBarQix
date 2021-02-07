package main.java.stringrules;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	@Test
	@DisplayName("Ensures that character 3 is well read")
	public void testIs3() {
		assertTrue(StringUtils.is3('3'));
		assertFalse(StringUtils.is3('5'));
	}
	
	@Test
	@DisplayName("Ensures that character 5 is well read")
	public void testIs5() {
		assertTrue(StringUtils.is5('5'));
		assertFalse(StringUtils.is5('3'));
	}
	
	@Test
	@DisplayName("Ensures that character 7 is well read")
	public void testIs7() {
		assertTrue(StringUtils.is7('7'));
		assertFalse(StringUtils.is7('5'));
	}	
}
