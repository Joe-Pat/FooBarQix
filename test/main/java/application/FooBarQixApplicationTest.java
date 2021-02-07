package main.java.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FooBarQixApplicationTest {
	
	@Test
	@DisplayName("End to End test")
	public void testCompute() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		FooBarQixApplication fbqApp = new FooBarQixApplication();
		Class[] cArg = new Class[1];
		cArg[0] = String.class;
		Method method = fbqApp.getClass().getDeclaredMethod("compute", cArg);
		method.setAccessible(true);
		assertEquals("FooBar", method.invoke(fbqApp, "51"));
		assertEquals("FooQix*FooBar", method.invoke(fbqApp, "03549"));
		assertEquals("FooFooFoo", method.invoke(fbqApp, "33"));
		assertEquals("FooBarBar", method.invoke(fbqApp, "15"));
		assertNotEquals("Bar", method.invoke(fbqApp, "51"));
	}
}
