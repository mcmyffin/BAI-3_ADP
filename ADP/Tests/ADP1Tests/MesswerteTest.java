package ADP1Tests;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import ADP1.Messwerte;

/**
 * @author sk
 * 
 */
public class MesswerteTest {

	/**
	 * @throws java.lang.Exception
	 */

	static Messwerte adp = new Messwerte();
	static Messwerte adp2 = new Messwerte();


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		adp.add(5);
		adp.add(4);
		adp.add(6);
		adp2.add(38);
		adp2.add(20);
		adp2.add(14);
		adp2.add(25);
	}

	@Test
	public void calculateMittelwertTest() {
		assertTrue(5 == adp.calculateMittelwert());
		assertTrue(24.25 == adp2.calculateMittelwert());
	}



}
