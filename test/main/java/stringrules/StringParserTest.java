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
		assertEquals("", stringParser.encodeString("0124689"));
		assertNotEquals("", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is Foo")
	public void testEncodeStringContaining3Not5Not7() {
		assertEquals("Foo", stringParser.encodeString("3"));
		assertEquals("Foo", stringParser.encodeString("01234689"));
		assertEquals("Foo", stringParser.encodeString("302"));
		assertEquals("Foo", stringParser.encodeString("3204"));
		assertNotEquals("Foo", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is Bar")
	public void testEncodeStringContaining5Not3Not7() {
		assertEquals("Bar", stringParser.encodeString("5"));
		assertEquals("Bar", stringParser.encodeString("01245689"));
		assertEquals("Bar", stringParser.encodeString("502"));
		assertEquals("Bar", stringParser.encodeString("5204"));
		assertNotEquals("Bar", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is Qix")
	public void testEncodeStringContaining7Not3Not5() {
		assertEquals("Qix", stringParser.encodeString("7"));
		assertEquals("Qix", stringParser.encodeString("01246789"));
		assertEquals("Qix", stringParser.encodeString("702"));
		assertEquals("Qix", stringParser.encodeString("7204"));
		assertNotEquals("Qix", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is FooBar")
	public void testEncodeStringContaining3And5Not7() {
		assertEquals("FooBar", stringParser.encodeString("35"));
		assertEquals("FooBar", stringParser.encodeString("012345689"));
		assertEquals("FooBar", stringParser.encodeString("3050"));
		assertEquals("FooBar", stringParser.encodeString("325"));
		assertEquals("FooBar", stringParser.encodeString("352"));
		assertEquals("FooBar", stringParser.encodeString("3254"));
		assertNotEquals("FooBar", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is BarQix")
	public void testEncodeStringContaining5And7Not3() {
		assertEquals("BarQix", stringParser.encodeString("57"));
		assertEquals("BarQix", stringParser.encodeString("507"));
		assertEquals("BarQix", stringParser.encodeString("012456789"));
		assertEquals("BarQix", stringParser.encodeString("5072"));
		assertEquals("BarQix", stringParser.encodeString("5274"));
		assertNotEquals("BarQix", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is FooQix")
	public void testEncodeStringContaining3And7Not5() {
		assertEquals("FooQix", stringParser.encodeString("37"));
		assertEquals("FooQix", stringParser.encodeString("012346789"));
		assertEquals("FooQix", stringParser.encodeString("3702"));
		assertEquals("FooQix", stringParser.encodeString("32704"));
		assertNotEquals("FooQix", stringParser.encodeString("0123456789"));
	}
	
	@Test
	@DisplayName("Result is FooQix")
	public void testEncodeStringContaining3And5And7() {
		assertEquals("FooBarQix", stringParser.encodeString("0123456789"));
	}
}
