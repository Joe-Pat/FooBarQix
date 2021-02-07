package main.java.mathrules;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathParserTest {

	private MathParser mathParser;
	
	@BeforeEach
	public void setUp() throws Exception {
		mathParser = new MathParser();
	}
	
	@Test
	@DisplayName("Not Divisible by 3 nor 5 nor 7") 
	public void testEncodeNotDivisibleBy3Nor5Nor7Number() {
		assertEquals("", mathParser.encodeNumber(8));
		assertEquals("", mathParser.encodeNumber(256));
		assertEquals("", mathParser.encodeNumber(1024));
	}
	
	@Test
	@DisplayName("Divisible by 3 only") 
	public void testEncodeDivisibleBy3OnlyNumber() {
		assertEquals("Foo", mathParser.encodeNumber(3));
		assertEquals("Foo", mathParser.encodeNumber(9));
		assertEquals("Foo", mathParser.encodeNumber(27));
	}
	
	@Test
	@DisplayName("Divisible by 5 only") 
	public void testEncodeDivisibleBy5OnlyNumber() {
		assertEquals("Bar", mathParser.encodeNumber(5));
		assertEquals("Bar", mathParser.encodeNumber(25));
	}
	
	@Test
	@DisplayName("Divisible by 7 only") 
	public void testEncodeDivisibleBy7OnlyNumber() {
		assertEquals("Qix", mathParser.encodeNumber(7));
		assertEquals("Qix", mathParser.encodeNumber(49));
	}
	
	@Test
	@DisplayName("Divisible by 3 not 5 not 7") 
	public void testEncodeDivisibleBy3Not5Not7Number() {
		assertEquals("Foo", mathParser.encodeNumber(6));
		assertEquals("Foo", mathParser.encodeNumber(12));
		assertEquals("Foo", mathParser.encodeNumber(36));
	}
	
	@Test
	@DisplayName("Divisible by 5 not 3 not 7") 
	public void testEncodeDivisibleBy5Not3Not7Number() {
		assertEquals("Bar", mathParser.encodeNumber(10));
		assertEquals("Bar", mathParser.encodeNumber(20));
		assertEquals("Bar", mathParser.encodeNumber(40));
	}
	
	@Test
	@DisplayName("Divisible by 7 not 3 not 5") 
	public void testEncodeDivisibleBy7Not3Not5Number() {
		assertEquals("Qix", mathParser.encodeNumber(14));
		assertEquals("Qix", mathParser.encodeNumber(28));
		assertEquals("Qix", mathParser.encodeNumber(112));
	}
	
	@Test
	@DisplayName("Divisible by 3 and 5 but not 7") 
	public void testEncodeDivisibleBy3And5Not7Number() {
		assertEquals("FooBar", mathParser.encodeNumber(15));
		assertEquals("FooBar", mathParser.encodeNumber(45));
	}
	
	@Test
	@DisplayName("Divisible by 3 and 7 but not 5") 
	public void testEncodeDivisibleBy3And7Not5Number() {
		assertEquals("FooQix", mathParser.encodeNumber(21));
		assertEquals("FooQix", mathParser.encodeNumber(63));
	}
	
	@Test
	@DisplayName("Divisible by 5 and 7 but not 3") 
	public void testEncodeDivisibleBy5And7Not3Number() {
		assertEquals("BarQix", mathParser.encodeNumber(35));
		assertEquals("BarQix", mathParser.encodeNumber(175));
	}
	
	@Test
	@DisplayName("Divisible by 3 and 5 and 7") 
	public void testEncodeDivisibleBy3And5And7Number() {
		assertEquals("FooBarQix", mathParser.encodeNumber(105));
		assertEquals("FooBarQix", mathParser.encodeNumber(210));
	}
}
