package co.simplon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CamelCaseTest {

	@Test
	public void shouldReturnStrIfOneWord() {
		String str = "Toto";
		assertEquals(str, CamelCase.camelCase(str));
	}
}
