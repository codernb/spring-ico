package ch.fhnw.edu.eaf.provider;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldProviderTest {
	
	private HelloWorldProvider helloWorldProvider;
	
	@Before
	public void setUp() {
		helloWorldProvider = new HelloWorldProvider();
	}

	@Test
	public void testGetMessage() throws Exception {
		assertEquals("Hello World!", helloWorldProvider.getMessage());
	}

}
