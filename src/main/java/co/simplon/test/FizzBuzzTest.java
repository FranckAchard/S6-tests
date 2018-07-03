package co.simplon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void shouldReturn0If00() {
		assertEquals("0", FizzBuzz.fizzBuzz(0, 0));
	}
	
	@Test
	public void shouldReturn1If11() {
		assertEquals("1", FizzBuzz.fizzBuzz(1, 1));
	}
	
	@Test
	public void shouldReturnFizzIf33() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3));
	}

	@Test
	public void shouldReturnBuzzIf55() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 5));
	}
	
	@Test
	public void shouldReturnFizzBuzzIf1515() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 15));
	}


/*	@Test
	public void shouldReturnListNumbers() {
		assertEquals("1234567", FizzBuzz.fizzBuzz(1, 7));
	}*/
	
	/*@Test
	public void shouldTransform3Multiple() {
		assertEquals("12Fizz45Fizz7", FizzBuzz.fizzBuzz(1, 7));
	}*/
	
	/*@Test
	public void shouldTransform3And5Multiple() {
		assertEquals("12Fizz4BuzzFizz7", FizzBuzz.fizzBuzz(1, 7));
	}*/
	
	@Test
	public void shouldTotallyWorks() {
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", FizzBuzz.fizzBuzz(1, 20));
	}

}
