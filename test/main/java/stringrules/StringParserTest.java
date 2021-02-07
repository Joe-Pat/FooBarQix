package main.java.stringrules;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringParserTest {

	private StringParser stringParser;
	
	@BeforeEach
	public void setUp() throws Exception {
		stringParser = new StringParser();
	}
	
	@Test
	@DisplayName("Result is empty")
	public void testEncodeStringNotContainingExpectedCaracters() {
		assertEquals("", stringParser.encodeString("124689"));
		assertNotEquals("", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is *")
	public void testEncodingStringContaining0() {
		assertEquals("*", stringParser.encodeString("0"));
		assertNotEquals("*", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is *Foo or Foo*")
	public void testEncodeStringContaining0And3() {
		assertEquals("*Foo", stringParser.encodeString("03"));
		assertEquals("Foo*", stringParser.encodeString("30"));
	}
	
	@Test
	@DisplayName("Result is *Foo or Foo*")
	public void testOrderEncodeString() {
		assertEquals("*FooQixBar", stringParser.encodeString("0375"));
		assertEquals("Foo*Bar", stringParser.encodeString("305"));
		assertEquals("BarFooQixQixBar**", stringParser.encodeString("53775001"));
	}
	
	@Test
	@DisplayName("Result is Foo")
	public void testEncodeStringContaining3Not5Not7() {
		assertEquals("Foo", stringParser.encodeString("3"));
		assertEquals("Foo", stringParser.encodeString("1234689"));
		assertEquals("Foo", stringParser.encodeString("32"));
		assertEquals("Foo", stringParser.encodeString("324"));
		assertNotEquals("Foo", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is Bar")
	public void testEncodeStringContaining5Not3Not7() {
		assertEquals("Bar", stringParser.encodeString("5"));
		assertEquals("Bar", stringParser.encodeString("1245689"));
		assertEquals("Bar", stringParser.encodeString("52"));
		assertEquals("Bar", stringParser.encodeString("524"));
		assertNotEquals("Bar", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is Qix")
	public void testEncodeStringContaining7Not3Not5() {
		assertEquals("Qix", stringParser.encodeString("7"));
		assertEquals("Qix", stringParser.encodeString("1246789"));
		assertEquals("Qix", stringParser.encodeString("72"));
		assertEquals("Qix", stringParser.encodeString("724"));
		assertNotEquals("Qix", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is FooBar")
	public void testEncodeStringContaining3And5Not7() {
		assertEquals("FooBar", stringParser.encodeString("35"));
		assertEquals("FooBar", stringParser.encodeString("12345689"));
		assertEquals("FooBar", stringParser.encodeString("35"));
		assertEquals("FooBar", stringParser.encodeString("325"));
		assertEquals("FooBar", stringParser.encodeString("352"));
		assertEquals("FooBar", stringParser.encodeString("3254"));
		assertNotEquals("FooBar", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is BarQix")
	public void testEncodeStringContaining5And7Not3() {
		assertEquals("BarQix", stringParser.encodeString("57"));
		assertEquals("BarQix", stringParser.encodeString("57"));
		assertEquals("BarQix", stringParser.encodeString("12456789"));
		assertEquals("BarQix", stringParser.encodeString("572"));
		assertEquals("BarQix", stringParser.encodeString("5274"));
		assertNotEquals("BarQix", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is FooQix")
	public void testEncodeStringContaining3And7Not5() {
		assertEquals("FooQix", stringParser.encodeString("37"));
		assertEquals("FooQix", stringParser.encodeString("12346789"));
		assertEquals("FooQix", stringParser.encodeString("372"));
		assertEquals("FooQix", stringParser.encodeString("3274"));
		assertNotEquals("FooQix", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is *FooBarQix")
	public void testEncodeStringContaining3And5And7() {
		assertEquals("*FooBarQix", stringParser.encodeString("0123456789"));
		assertNotEquals("", stringParser.encodeString("0123456789"));
	}
}
