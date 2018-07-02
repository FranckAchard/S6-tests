package co.simplon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void shouldReturn0If00() {
		assertEquals("0", FizzBuzz.fizzBuzz(0, 0));
	}

	@Test
	public void shouldReturnListNumbers() {
		assertEquals("1234567", FizzBuzz.fizzBuzz(1, 7));
	}
}
