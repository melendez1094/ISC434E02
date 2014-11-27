import static org.junit.Assert.*;

import org.junit.Test;


public class TestMyMath {
	
	MyMath test = new MyMath();

	@Test
	public void testPerimeterOfSquare() {
		
		assertEquals("Perimetro de cuadrado de lado igual a 5 tiene"
				+ "que ser 20", 20, test.perimeterOfSquare(5));
		
	}

	@Test
	public void testTwoSumOfN() {

		

	}

	@Test
	public void testEvenDivide() {
		fail("Not yet implemented");
	}

}
