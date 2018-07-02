package co.simplon.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SmileysTest {

	@Test
	public void shouldReturn0IfNull() {
		assertEquals(0, Smileys.countSmileys(null));
	}
	
	@Test
	public void shouldReturn0IfEmpty() {
		List<String> arr = new ArrayList<String>();
		assertEquals(0, Smileys.countSmileys(arr));
	}
	
	@Test
	public void shouldReturn1IfOneSmiley() {
		List<String> arr = new ArrayList<String>();
		arr.add(":)");
		assertEquals(1, Smileys.countSmileys(arr));
	}
	
	@Test
	public void shouldReturn0IfNotSmiley() {
		List<String> arr = new ArrayList<String>();
		arr.add(":[");
		assertEquals(0, Smileys.countSmileys(arr));
	}
	

}
