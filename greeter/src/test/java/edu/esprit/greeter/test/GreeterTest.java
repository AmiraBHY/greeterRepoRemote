package edu.esprit.greeter.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.esprit.greeter.Greeter;

public class GreeterTest {
	
	//comment
	Greeter greeter;

	@Before
	public void setUp() {

		greeter = new Greeter();

	}

	@Test
	public void itShouldSayHelloId() {

		String result = greeter.sayHello("word");
		Assert.assertEquals("Hello word", result);

	}

	@Test(expected = IllegalArgumentException.class)
	public void itShouldRaiseException() {
		String param = "MAN";
		greeter.sayHello(param);

	}

	@After
	public void tearDown() {

		greeter = null;

	}

}
