package co.simplon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CamelCaseTest {
	
	@Test
	public void shoudReturnSthIfNull () {
		assertEquals("null!", CamelCase.camelCase(null));
	}

	@Test
	public void shouldReturnUpperStrIfOneWord() {
		String str = "toto";
		assertEquals("Toto", CamelCase.camelCase(str));
	}
	
	@Test
	public void shouldReturnCamelOneWord() {
		String str = "tOTO";
		assertEquals("Toto", CamelCase.camelCase(str));	
	}
	
	@Test
	public void shoudlReturnCamelWordsWithUnderOrHyphen() {
		String str = "toto_tata-tITI";
		assertEquals("TotoTataTiti", CamelCase.camelCase(str));	
	}
	
}
