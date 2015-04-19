package ADP1Tests;
/**
 * 
 */


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ADP1.IListen;
import ADP1.Listen;

/**
 * @author sk
 *
 */
public class ListenTest {

	static IListen<String> liste1;
	static IListen<String> liste2;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		liste1 =  new Listen<String>();
		liste2 =  new Listen<String>();
		liste1.cons("hallo4");
		liste1.cons("hallo3");
		liste1.cons("hallo2");
		liste1.cons("hallo1");
	}

	@Test
	public void consTest() {
		liste1.cons("test:D");
		String result = liste1.head();
		assertTrue(result.equals("test:D"));
	}
	
	@Test
	public void headTest() {
		String result = liste1.head();
		assertTrue(result.equals("hallo1"));
	}
	
	@Test
	public void lengthTest() {
		assertTrue(4 == liste1.length());
	}
	
	@Test
	public void isEmptyTest() {
		assertTrue(liste2.isempty());
		assertFalse(liste1.isempty());
	}

	@Test
	public void insertTest() {
		String result = "teeeest";
		liste1.insert(result, 1);
		liste1.head();
		assertTrue(result.equals(liste1.head()));
		
	}
}
